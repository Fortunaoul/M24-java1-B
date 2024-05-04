import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author João
 * @version 2024-04-20
 */
public class Mosca extends Inseto
{
    //Ca,pos e fIELDS
    private int velocidade;
    //Constructor padrão (não recebe parametros)
    public Mosca(){
        velocidade = 1;
    }
    //Cnstructor personalizado como sobrecarga de métodos
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang);//colocando o angulo que eu passar
    }
    /**
     * Método Act é executado sempre que apertamos o botão Act ou ficará em execução
     * quando apertamos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();
    }
}
