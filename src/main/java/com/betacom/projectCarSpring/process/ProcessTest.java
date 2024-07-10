package com.betacom.projectCarSpring.process;

import com.betacom.projectCarSpring.dto.MacchinaDto;
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

	private List<Integer> iDs = new ArrayList<Integer>();


	public void execute() {

	}

private void veicoloProcess() {

	MacchinaDto input = new MacchinaDto();
	input.setCilindrata(900);
	input.setTarga("DF902CA");
	input.setNumeroPorte(5);

	iDs.add(macchinaS.createMacchina(input));

}
}
