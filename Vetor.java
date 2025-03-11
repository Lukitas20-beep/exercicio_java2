public class Vetor {
    private double x, y, z;

    public Vetor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vetor adicionar(Vetor v) {
        return new Vetor(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public void multiplicacaoEscalar(double num) {
        this.x *= num;
        this.y *= num;
        this.z *= num;
    }

    public double produtoEscalar(Vetor v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public String toString() {
        return "Vetor("+ x + y + z + ")";
    }
}

