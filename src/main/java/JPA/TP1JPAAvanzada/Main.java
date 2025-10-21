package JPA.TP1JPAAvanzada;

import JPA.TP1JPAAvanzada.Repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired PacienteRepository pacienteRepo;
    @Autowired MedicoRepository medicoRepo;
    @Autowired ConsultaRepository consultaRepo;
    @Autowired HistoriaClinicaRepository historiaRepo;
    @Autowired MedicamentoRepository medicamentoRepo;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        // Persistencia mínima
        Paciente p1 = new Paciente("Ana", 35, "OSDE");
        Paciente p2 = new Paciente("Luis", 28, "Swiss Medical");
        Paciente p3 = new Paciente("Marta", 42, "OSDE");

        Medico m1 = new Medico("Dr. Gómez", "Clínico");
        Medico m2 = new Medico("Dra. Pérez", "Cardióloga");

        HistoriaClinica h1 = new HistoriaClinica("Paciente con antecedentes de hipertensión");
        HistoriaClinica h2 = new HistoriaClinica("Paciente con historial de alergias");

        p1.setHistoriaClinica(h1);
        p3.setHistoriaClinica(h2);

        Medicamento med1 = new Medicamento("Ibuprofeno");
        Medicamento med2 = new Medicamento("Paracetamol");
        Medicamento med3 = new Medicamento("Losartán");

        medicamentoRepo.saveAll(List.of(med1, med2, med3));

        p1.getMedicamentos().addAll(List.of(med1, med3));
        p2.getMedicamentos().add(med2);
        p3.getMedicamentos().addAll(List.of(med1, med2));

        pacienteRepo.saveAll(List.of(p1, p2, p3));
        medicoRepo.saveAll(List.of(m1, m2));
        historiaRepo.saveAll(List.of(h1, h2));

        Consulta c1 = new Consulta(LocalDate.of(2023, 1, 10), "Gripe", p1, m1);
        Consulta c2 = new Consulta(LocalDate.of(2023, 2, 5), "Dolor de cabeza", p2, m1);
        Consulta c3 = new Consulta(LocalDate.of(2023, 3, 15), "Chequeo general", p3, m2);
        Consulta c4 = new Consulta(LocalDate.of(2023, 4, 20), "Presión alta", p1, m2);

        consultaRepo.saveAll(List.of(c1, c2, c3, c4));

        // Consultas requeridas

        System.out.println("\n1. Pacientes mayores de 30:");
        pacienteRepo.findByEdadGreaterThan(30)
                .forEach(p -> System.out.println(p.getNombre()));

        System.out.println("\n2. Consultas realizadas por el Dr. Gómez:");
        consultaRepo.findByMedicoNombre("Dr. Gómez")
                .forEach(c -> System.out.println(c.getFecha() + " - " + c.getDiagnostico()));

        System.out.println("\n3. Medicamentos asociados a Marta:");
        pacienteRepo.findByNombre("Marta").getMedicamentos()
                .forEach(m -> System.out.println(m.getNombre()));

        System.out.println("\n4. Consultas con diagnóstico y nombre del paciente:");
        consultaRepo.findAll().forEach(c ->
                System.out.println(c.getDiagnostico() + " - " + c.getPaciente().getNombre()));

        System.out.println("\n5. Promedio de edad de los pacientes:");
        double promedioEdad = pacienteRepo.findAll().stream()
                .mapToInt(Paciente::getEdad)
                .average()
                .orElse(0.0);
        System.out.println(promedioEdad);

        System.out.println("\n6. Pacientes con obra social OSDE:");
        pacienteRepo.findByObraSocial("OSDE")
                .forEach(p -> System.out.println(p.getNombre()));

        System.out.println("\n7. Médicos y cantidad de consultas que atendieron:");
        medicoRepo.findAll().forEach(m ->
                System.out.println(m.getNombre() + ": " + m.getConsultas().size() + " consultas"));

        System.out.println("\n8. Pacientes con descripción de su historia clínica:");
        pacienteRepo.findAll().forEach(p -> {
            String desc = p.getHistoriaClinica() != null
                    ? p.getHistoriaClinica().getDescripcion()
                    : "Sin historia clínica";
            System.out.println(p.getNombre() + " - " + desc);
        });
    }
}