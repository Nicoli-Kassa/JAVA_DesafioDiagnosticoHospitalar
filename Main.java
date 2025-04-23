public class Main {
    public static void main(String[] args) {
        // Sintomas de um paciente
        String[] sintomasPaciente1 = {"Febre", "dor de cabeça", "Tosse", "Fadiga"};
        String[] sintomasPaciente2 = {"Febre", "Tosse seca", "Perda de paladar", "Dor de garganta"};

        // Instâncias dos diagnósticos
        DiagnosticoGripe diagGripe = new DiagnosticoGripe();
        DiagnosticoCovid diagCovid = new DiagnosticoCovid();

        System.out.println("\n+--- Sintomas comuns da GRIPE ---+");
        diagGripe.exibirSintomasComuns();
        System.out.println("\n+--- Sintomas comuns da COVID ---+");
        diagCovid.exibirSintomasComuns();


        // Avaliando paciente 1
        System.out.println("\n\n+--- Avaliação do Paciente 1 ---+");
        System.out.println("Sintomas informados: ");
        for (String sintoma : sintomasPaciente1) {
            System.out.println("- " + sintoma);
        }

        System.out.println("\nDiagnóstico de Gripe:");
        System.out.println("Resultado: " + diagGripe.avaliarPaciente(sintomasPaciente1));

        System.out.println("\nDiagnóstico de COVID-19:");
        System.out.println("Resultado: " + diagCovid.avaliarPaciente(sintomasPaciente1));


        // Avaliando paciente 2
        System.out.println("\n\n+--- Avaliação do Paciente 2 ---+");
        System.out.println("Sintomas informados: ");
        for (String sintoma : sintomasPaciente2) {
            System.out.println("- " + sintoma);
        }

        System.out.println("\nDiagnóstico de Gripe:");
        System.out.println("Resultado: " + diagGripe.avaliarPaciente(sintomasPaciente2));

        System.out.println("\nDiagnóstico de COVID-19:");
        System.out.println("Resultado: " + diagCovid.avaliarPaciente(sintomasPaciente2));

    }
}
