package aula21;

    //Atributos
    public class Tamagotchi {

    private Estado estado;

    //Construtor
    public Tamagotchi() {
        this.setEstado(new ComFome(this));
    }

        public void comer() {
            getEstado().comer();
        };
        public void beber() {
            getEstado().beber();
        };
        public void fazerCarinho() {
            getEstado().fazerCarinho();
        };

    //Get e Set
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
