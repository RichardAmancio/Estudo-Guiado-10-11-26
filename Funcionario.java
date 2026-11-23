public class Funcionario { 
    private String nome; 
    private double salarioMensal; 
    private final boolean pj; 
    public Funcionario(String nome, double salarioMensal) { 
    this(nome, salarioMensal, false); 
        } 
    protected Funcionario(String nome, double salarioMensal, boolean pj) { 
    if (nome == null || nome.isBlank() || salarioMensal < 0) { 
    throw new IllegalArgumentException("Nome e salário inválidos."); 
            } 
    this.nome = nome; 
    this.salarioMensal = salarioMensal; 
    this.pj = pj; 
        } 
    public boolean isPJ() { 
    return pj; 
        } 
        public String getNome() { return nome; }

        public void setNome(String nome) {
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("Nome deve ser preenchido.");
            }
            this.nome = nome;
        }
    
        public double getSalarioMensal() { 
            return salarioMensal; }
    
        public void setSalarioMensal(double salarioMensal) {
            if (salarioMensal < 0) {
                throw new IllegalArgumentException("Salário não pode ser negativo.");
            }
            this.salarioMensal = salarioMensal;
        }
        public double calcularBruto() {
            return salarioMensal;
        }
        protected static double arredondar(double valor) {
            return Math.round(valor * 100.0) / 100.0;
        }
    
        public double calcularINSS() {
            
                      
        }
    }
