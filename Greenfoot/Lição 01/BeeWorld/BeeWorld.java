import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{
    private Abelha abelha = null;
    private int score;
    private Placar placar=null;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        abelha = new Abelha();
        addObject(abelha,55,66);
        Aranha aranha = new Aranha();
        addObject(aranha,451,130);
        //utilizando o for para criar as moscas
        for (int i=0;i<20;i++){
            int pX = Greenfoot.getRandomNumber(getWidth());
            int pY = Greenfoot.getRandomNumber(getHeight());
            int vel = Greenfoot.getRandomNumber(5)+1;
            int ang = Greenfoot.getRandomNumber(360);
            addObject(new Mosca(vel,ang), pX, pY);
        }
        //Criando o placar do mundo
        placar = new Placar();
        addObject(placar, 750, 30);
    }
    /**
     * getter para obter a instância da abelha criada no mundo.
     */
    public Abelha getAbelha(){
        return abelha;
    }
    
    public void addScore(int value){
        score+=value;//score = score + value;
        placar.setTexto("Score: " +score);
    }
}
