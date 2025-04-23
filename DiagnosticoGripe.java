public class DiagnosticoGripe extends Diagnostico{
    public DiagnosticoGripe(){
        // Sintomas comund da gripe
        this.sintomasComuns = new String[]{
                "Febre", "Dor de cabeça","Dor no corpo", "Tosse", "Fadiga", "Coriza"
        };
    }

    @Override
    public String avaliarPaciente(String[] sintomasInformados){
        int contadorSintomas = 0;
        for (String sintoma : sintomasInformados) {
            for (String sintomaComum : sintomasComuns) {
                if (sintoma.toLowerCase().equals(sintomaComum.toLowerCase())) {
                    contadorSintomas++;
                    break;
                }
            }
        }
        if(contadorSintomas >= 3){
            return "Provável Gripe. Recomendações: repouso, hidratação adequada e medicamentos para alívio dos sintomas. Consulte um médico se os sintomas persistirem por mais de 5 dias.";
        } else if (contadorSintomas >= 1) {
            return "Possível Gripe. Observe os sintomas, mantenha-se hidratado e descanse. Consulte um médico se surgirem novos sintomas.";
        } else {
            return "Improvável ser Gripe. Os sintomas não correspondem aos típicos da gripe.";
        }
    }
}
