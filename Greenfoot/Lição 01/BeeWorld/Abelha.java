import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abelha extends Actor
{
    //Constante
    public static int PONTOS = 100;
    //Campos ou Fields
    public int vidas = 0;
    public int score = 0;
    public int imgIdx = 0;
    //Criando campo do tipo conjunto de imagens 
    private GreenfootImage[] imagens;
    //Constructors
    public Abelha(){
        vidas = 3;
        score = 0;
        //Definir tamanho do conjunto 
        imagens = new GreenfootImage[4]; //Definindo tamanho do conjunto em 4 elementos
        //Definir as imagnes
        for (int i=0;i<4;i++){
            imagens[i] = new GreenfootImage("bee0"+(i+1)+".png");
        }
    }
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(3);
        trocarImagem();
        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
        //verificando se está nos cantos
        verificarPosicao();
        //Verifica se toca em uma mosca
        capturaMosca();
        //Verifica se foi capturada pela aranha
        capturadaPelaAranha();
        //Mostra quantidades de vidas
        mostrarVidas();
        //Mostra o score
        //mostrarScore();
    }

    /**
     * Método que verifica se está na direita do mundo
     */
    public boolean isnaDireita(){
        if(getX() > getWorld().getWidth()-10){
            return true;
        }
        return false;
    }

    /**
     * Método que verifica se está na esquerda do mundo
     */
    public boolean isNaEsquerda(){
        return ( getX()<10 );
    }
    /**
     * Método que verifica se está na base do mundo
     */
    public boolean isNaBase(){
        return ( getY() > getWorld().getHeight()-10 );
    }
    /**
     * Método que verifica se está no topo do mundo
     */
    public boolean isNoTopo(){
        return ( getY() < 10 );
    }
    /**
     * Método que verifica se a abelha está nos cantos e reposiciona ela
     */
    public void verificarPosicao(){
        //verificando se está na direita
        if (isnaDireita()){
            setLocation(10, getY());
        }
        //Verifica se está na esquerda
        if( isNaEsquerda()){
            setLocation(getWorld().getWidth()-10, getY());
        }
        //Verifica se está no topo do mundo
        if (isNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        //Verifica se ele está na base do mundo
        if (isNaBase()){
            setLocation(getX(), 10);
        }
    }
    /**
     * Método que captura a mosca
     */
    public void capturaMosca(){
        //Verificando se tocou em uma mosca
        if(isTouching(Mosca.class)){
            //remove a mosca tocada
            removeTouching(Mosca.class);
            //Tocar o Slarp
            Greenfoot.playSound("slarp.wav");
            //Aumentar o score
            score += PONTOS;
            //Colocando o score do mundo
            ((BeeWorld)getWorld()).addScore(PONTOS);
            //Adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(Greenfoot.getRandomNumber(5)+1,
            Greenfoot.getRandomNumber(360)),pX, pY);
        }
    }
    /**
     * Método que irá capturar a abelha pela aranha
     */
    public void capturadaPelaAranha(){
        if(isTouching(Aranha.class)){
            Greenfoot.playSound("ouch.wav");
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(pX, pY);
            vidas--; //decremento
            if (vidas<1){
                Greenfoot.stop();
                getWorld().showText("GAME OVER \n" + score, 400, 300);
            }
        }
    }
    public void mostrarVidas(){
        getWorld().showText("Vidas: "+ vidas, 60, 20);
    }
    public void mostrarScore(){
        getWorld().showText("Score: "+ score, 700, 20);
    }
    public void trocarImagem(){
        setImage(imagens[imgIdx]);
        imgIdx=(imgIdx+1)%4;
    }
    
}

