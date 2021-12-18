package Questao04;

public class Triangulo {
    private Double a;
    private Double b;
    private Double c;
    
    public Triangulo(Double a, Double b, Double c) throws ProporcoesInvalidasException{
        try {
            if ((a > Math.abs(b - c) && a < (b + c)) && (b > Math.abs(a - c) && b < (a + c)) && (c > Math.abs(a - b) && c < (a + b))) {
                this.a = a;
                this.b = b;
                this.c = c;
                System.out.println("Triângulo criado com sucesso! \n");
            }else{
                throw new ProporcoesInvalidasException("Triângulo não pode ser criado. Proporções Inválidas foram digitadas.");
            }    
        } catch (ProporcoesInvalidasException e) {
            System.out.println("Triângulo não pode ser criado. Proporções Inválidas foram digitadas.");
        }
        
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) throws ProporcoesInvalidasException{
        try {
            if (a > Math.abs(b - c) && a < (b + c)){
                this.a = a;
            }else{
                throw new ProporcoesInvalidasException("Proporcoes Inválida");
            }
        } catch (ProporcoesInvalidasException e) {
            System.out.println("Proporcoes Inválida");
        }
        
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) throws ProporcoesInvalidasException{
        try {
            if (b > Math.abs(a - c) && b < (a + c)){
                this.b = b;
            }else{
                throw new ProporcoesInvalidasException("Proporção inválida.");
            }
        } catch (ProporcoesInvalidasException e) {
            System.out.println("Proporção Inválida");
        }
        
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) throws ProporcoesInvalidasException{
        try {
            if (c > Math.abs(a - b) && c < (a + b)){
                this.c = c;
            }else{
                throw new ProporcoesInvalidasException("Proporção inválida.");
            }
        } catch (ProporcoesInvalidasException e) {
            System.out.println("Proporção Inválida");
        }
        
    }

    public void getDados(){
        System.out.println("As proporções do trinagulo são: ");
        System.out.println("a: " + getA());
        System.out.println("b: " + getB());
        System.out.println("c: " + getC());
        System.out.print("\n");
    }
    
}
