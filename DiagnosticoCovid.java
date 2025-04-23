public class DiagnosticoCovid extends Diagnostico{
    public DiagnosticoCovid(){
        // Sintomas comund da gripe
        this.sintomasComuns = new String[]{
                "Febre", "Tosse seca", "Cansaço", "Perda de paladar", "Perda de olfato",
                "Dificuldade respiratória", "Dor de garganta", "Dor de cabeça"
        };
    }


    @Override
    public String avaliarPaciente(String[] sintomasInformados) {
        int contadorSintomas = 0;
        boolean sintomasChave = false;

        for (String sintoma : sintomasInformados) {
            // Verifica sintomas específicos da COVID
            if (sintoma.toLowerCase().equals("perda de paladar") ||
                    sintoma.toLowerCase().equals("perda de olfato") ||
                    sintoma.toLowerCase().equals("dificuldade respiratória")) {
                sintomasChave = true;
            }

            for (String sintomaComum : sintomasComuns) {
                if (sintoma.toLowerCase().equals(sintomaComum.toLowerCase())) {
                    contadorSintomas++;
                    break;
                }
            }
        }

        if (contadorSintomas >= 3 || sintomasChave) {
            return "Possível COVID-19. Recomendações: isolamento imediato, teste diagnóstico e consulta médica. Monitore sua oxigenação se possível.";
        } else if (contadorSintomas >= 1) {
            return "Baixa probabilidade de COVID-19, mas não descartada. Recomenda-se teste diagnóstico por precaução e monitoramento dos sintomas.";
        } else {
            return "Improvável ser COVID-19. Os sintomas não correspondem aos típicos da doença.";
        }
    }
}