abstract class Diagnostico {
    protected String[] sintomasComuns;

    // Metodo abstrato a ser implementado pelas subclasses
    abstract String avaliarPaciente(String[] sintomasInformados);

    // Metodo para exibir sintomas comuns da doença
    public void exibirSintomasComuns(){
        System.out.println("Sintomas comuns:");
        for(String sintoma : sintomasComuns){
            System.out.println("- " + sintoma);
        }
    }
}
