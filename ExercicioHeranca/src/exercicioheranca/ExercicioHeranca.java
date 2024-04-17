package exercicioheranca;

public class ExercicioHeranca {
    public static void main(String[] args) {

        Carro c = new Carro();
        Moto m = new Moto();
        Veiculo v = new Veiculo();
        
        
        System.out.println("Dados do Carro");
        v.setCodveivulo("123");
        v.setMarcaVeiculo("BMW");
        v.setModeloveiculo("X1");
        
        c.setQtdHp(204);
        
        System.out.println("Dados da Moto");
        v.setCodveivulo("456");
        v.setMarcaVeiculo("Yamaha");
        v.setModeloveiculo("R6");
        
        m.setQtdCilindradas(600);
        
    }
    
}
