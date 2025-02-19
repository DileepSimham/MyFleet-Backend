package com.myfleet;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.QueryParam;

@RestController
@RequestMapping("/myfleet")
@CrossOrigin("http://localhost:4200")
public class URlController {

	@GetMapping("/download")
	public void downloadReport( @QueryParam("turbineSN") String turbineSN,
            @QueryParam("downloadType") String downloadType,
            @QueryParam("startYear") int startYear,
            @QueryParam("startMonth") String startMonth,
            @QueryParam("endYear") int endYear,
            @QueryParam("endMonth") String endMonth,
            @QueryParam("hoursFlag") String hoursFlag,
            @QueryParam("startsFlag") String startsFlag,
            @QueryParam("siteName") String siteName,
            @QueryParam("mndFlag") String mndFlag,
            @QueryParam("ucFlag") String ucFlag,
            @QueryParam("mwhFlag") String mwhFlag,
            @QueryParam("contractNumber") String contractNumber) {

		System.out.println("turbineSN = " + turbineSN);
		System.out.println("downloadType = " + downloadType);
		System.out.println("startYear = " + startYear);
		System.out.println("startMonth = " + startMonth);
		System.out.println("endYear = " + endYear);
		System.out.println("endMonth = " + endMonth);
		System.out.println("hoursFlag = " + hoursFlag);
		System.out.println("startsFlag = " + startsFlag);
		System.out.println("siteName = " + siteName);
		System.out.println("mndFlag = " + mndFlag);
		System.out.println("ucFlag = " + ucFlag);
		System.out.println("mwhFlag = " + mwhFlag);
		System.out.println("contractNumber = " + contractNumber);
//		return "Report generation initiated for Turbine: " + turbineSN;
	}

}
