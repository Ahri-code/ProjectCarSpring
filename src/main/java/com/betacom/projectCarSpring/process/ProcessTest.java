package com.betacom.projectCarSpring.process;

import com.betacom.projectCarSpring.dto.MacchinaDto;
import com.betacom.projectCarSpring.exeption.AcademyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.betacom.projectCarSpring.service.iBiciService;
import com.betacom.projectCarSpring.service.iMacchinaService;
import com.betacom.projectCarSpring.service.iMotoService;
import com.betacom.projectCarSpring.service.iVeicoloService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProcessTest {

	@Autowired
	private iBiciService biciS;

	@Autowired
	private iMacchinaService macchinaS;

	@Autowired
	private iMotoService motoS;

	@Autowired
	private iVeicoloService veiclS;

	public static Logger log = LoggerFactory.getLogger(ProcessTest.class);
	private List<Integer> iDs = new ArrayList<Integer>();


	public void execute() {
//		veicoloProcess();
		listMacchina();
		removeSocio(1);
	}

	private void veicoloProcess() {

		System.out.println("***BEGIN CREATE***");

		MacchinaDto input = new MacchinaDto();
		input.setCilindrata(900);
		input.setTarga("DF902CA");
		input.setNumeroPorte(5);

		iDs.add(macchinaS.createMacchina(input));
		System.out.println("***AFTER CREATE***");

	}

	private void listMacchina() {
		log.info("List socio**********");
		List<MacchinaDto> lS = macchinaS.listAllMacchine();
		lS.stream().forEach(c->log.info(c.toString()));
	}

	private void removeSocio(Integer id) {
		try {
			MacchinaDto m = new MacchinaDto();
			m.setId(id);
			macchinaS.remove(m);
			log.info("Dopo eliminazione SOCIO**********");
			listMacchina();
		}catch (AcademyException e) {
			log.error("Errore in cancellazione socio: "+e.getMessage());
		}
	}
}
