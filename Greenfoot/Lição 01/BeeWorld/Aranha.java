import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aranha extends Inseto
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      move(1);
      if(Greenfoot.getRandomNumber(100)+1 <= 10){
          turn(Greenfoot.getRandomNumber(91)-45);
      }
      verificarCanto();
      acelerarAranha();
      capturaMosca();
      interceptarAbelha();
    }
    /**
     * Método que irá acelerar a aranha em determinada área do tabuleiro
     */
    public void acelerarAranha(){
        if(getX()>=200 && getX()<=600 && getY()>=100 && getY()<=500){
            move(2);
        }
    }
    /**
     * método que captura a mosca pela aranha
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
    /**
     * 
     */
    public void interceptarAbelha(){
                    //Cast de BeeWolrd => Força o mundo a ser do tipo BeeWorld
        Abelha ab = ((BeeWorld) getWorld()).getAbelha();
        if (ab!=null){
            turnTowards(ab.getX(), ab.getY());
        }
    }
}
