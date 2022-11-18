package com.appdev.marrk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.marrk.Entity.EvacEntity;
import com.appdev.marrk.Service.EvacService;


@RestController
@RequestMapping("/evac")
public class EvacController {
	
	@Autowired
	EvacService eserv;
	
	//TEST
	@GetMapping("/test")
	public String printHelloMarrk() {
		return "Hello, Marrk";
	}
	
	@PostMapping("/postEvac")
	public EvacEntity insertEvac(@RequestBody EvacEntity evac) {												//CREATE AN EVAC
		return eserv.insertEvac(evac);
	}
	
	@GetMapping("/getAllEvac")
	public List<EvacEntity> getAllStudents(){																	//READ ALL EVAC
		return eserv.getAllEvac();
	}
	
	@PutMapping("/putEvac")
	public EvacEntity putEvac(@RequestParam int id, @RequestBody EvacEntity newEvacDteails) throws Exception{	//UPDATE EVAC
		return eserv.putEvac(id, newEvacDteails);
	}
	
	@DeleteMapping("/deleteEvac/{id}")
	public String deleteEvac(@PathVariable int id) {															//DELETE EVAC
		return eserv.deleteEvac(id);
	}
}
