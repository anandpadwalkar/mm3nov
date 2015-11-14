package com.iitms.rfcampuspresentation.authentication;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iitms.rfcampusdata.authentication.entity.ModuleMasterEntity;
import com.iitms.rfcampusdata.authentication.entity.UniversityEntity;
import com.iitms.rfcampusdomain.authentication.service.ModuleService;
import com.iitms.rfcampusdomain.authentication.service.UniversityAndBoardService;

@Controller
public class UniversityController
{
	 private static final Logger logger=org.slf4j.LoggerFactory.getLogger(UniversityController.class);
    @Autowired
    ModuleService moduleService; 
	@Autowired
	UniversityAndBoardService universityAndBoardService;

	@RequestMapping(value = "/university", method = RequestMethod.GET)
	public String university_default_redirect(Model model) {
		model.addAttribute("university", new UniversityEntity());
		model.addAttribute("universityList", universityAndBoardService.getAllUniversity());
		List<ModuleMasterEntity> moduleList = moduleService.listAuthorisedModule();
		model.addAttribute("ModuleList", moduleList);
		return "university";
	}

	@RequestMapping(value = "/university/add", method = RequestMethod.POST)
	public String createUniversity(@ModelAttribute("university") UniversityEntity universityEntity, Model model) {
		boolean b = false;
		b = universityAndBoardService.addUniversity(universityEntity);
		logger.info("Result : " + b);

		return "redirect:/university";
	}
	

	@RequestMapping(value = "/university/update", method = RequestMethod.POST)
	public String uppdateUniversity(@ModelAttribute("university") UniversityEntity universityEntity, Model model) {
		boolean b = false;
		b = universityAndBoardService.updateUniversity(universityEntity);
		logger.info("Result : " + b);

		return "redirect:/university";
	}

}
