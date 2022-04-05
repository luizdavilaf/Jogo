package negocio;

public class ArcoEFlecha implements Arma{
    protected final int dano;
    

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArcoEFlecha other = (ArcoEFlecha) obj;
        if (dano != other.dano)
            return false;
        return true;
    }



    public ArcoEFlecha()
    {
        this.dano=20;        
    }

    

    @Override
    public int plusDano() {
        return dano;
        // TODO Auto-generated method stub
        
    }
    
}
