import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
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
            //Adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
}

