package checkpoint;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    
	public static void main(String[] args) {

    Clinica vetClinica = new Clinica("vetClinica01", "Rua Itajuba, Centro, 14", "(11)94444-3333");
    Clinica petitaClinica = new Clinica("PetitaClinica", "Rua JK, BPS, 230", "(11)93030-2211");
    Clinica vetPetClinica = new Clinica("vetPetClinica", "Rua Silveira, Centro, 350", "(11)94430-7755");

    Atendente atd01 = new Atendente("Gabriely", "(35)93341-2319", "376444028-35",1500.00,220,"Noite");

    Veterinario vet01 = new Veterinario("Luis Gustavo", "(35)92840-5060", "386524028-10", 3000.00, 220, "Raio-x");
    Veterinario vet02 = new Veterinario("Cassio Teixeira", "(11)94233-1027","288783311-43", 3000.00, 220, "Vacina");
    Veterinario vet03 = new Veterinario("Alexander Welker", "(45)96633-0892","310226455-59", 6000.00, 220, "Cirurgia");

    Dono dono1 = new Dono("Leandro", "Rua Campinas, Centro, 411", "(35)93121-2181");
    Dono dono2 = new Dono("Deborah", "Rua Alvarenga, Roça, 910", "(35)99967-3349");
    Dono dono3 = new Dono("Andrea", "Rua Sao Paulo, Centro, 34", "(35)98821-5659");

    Animal pet1 = new Animal("Luna", "Cachorro", "Vira-lata", LocalDate.of(2021,10,31));
    Animal pet2 = new Animal("Julie", "Cachorro", "Border collie", LocalDate.of(2018,3,15));
    Animal pet3 = new Animal("Yume", "Gato", "Persa", LocalDate.of(2015,5,21));
    Animal pet4 = new Animal("Rex", "Cachorro", "Golden", LocalDate.of(2022,11,12));

    dono1.adicionarAnimal(pet1);
    dono2.adicionarAnimal(pet2);
    dono3.adicionarAnimal(pet3);
    dono3.adicionarAnimal(pet4);

    Consulta consulta1 = new Consulta(null, null, 0D, null, null, null);
    consulta1.marcaConsulta(LocalDate.of(2023, 6, 20), LocalTime.of(11, 30, 0), vet01, dono2);
    consulta1.adicionarDespesa(30D);
    consulta1.atualizarDiagnostico("O cachorro está com a pata quebrada");

    Consulta consulta2 = new Consulta(null, null, 0D, null, null, null);
    consulta2.marcaConsulta(LocalDate.of(2023, 6, 16), LocalTime.of(11, 30, 0), vet02, dono3);
    consulta2.adicionarDespesa(60D);
    consulta2.adicionarDespesa(30D);
    consulta2.atualizarDiagnostico("O gato precisa de vacina");

    Consulta consulta3 = new Consulta(null, null, 0D, null, null, null);
    consulta3.marcaConsulta(LocalDate.of(2023, 6, 17), LocalTime.of(16, 0, 0), vet03, dono1);
    consulta3.adicionarDespesa(50D);
    consulta3.atualizarDiagnostico("O cachorro está resfriado");


        vetClinica.adicionarConsulta(consulta1);
        vetClinica.adicionarConsulta(consulta2);
        vetClinica.adicionarConsulta(consulta3);

        // Exibindo os diagnosticos de Consultas da Clinica VetClinica:
        for(int i =0; i < vetClinica.getConsultas().size(); i++){
            System.out.println(vetClinica.getConsultas().get(i).getDiagnostico());
        }

        // Exibindo os Donos de cada Animal
        System.out.println(dono1.getNome() + " eh dono de: " + dono1.getAnimais().get(0).getNome());
        System.out.println(dono2.getNome() + " eh dono de: " + dono2.getAnimais().get(0).getNome());
        System.out.println(dono3.getNome() + " eh dono de: " + dono3.getAnimais().get(0).getNome());
        System.out.println(dono3.getNome() + " eh dono de: " + dono3.getAnimais().get(1).getNome());

    }

}