package com.divit.springboot.application.util;

import java.util.List;
import java.util.Set;

import com.divit.springboot.application.model.Candidate;

public final class CandidatesUtil {

	private CandidatesUtil() {
	}

	/**
	 * 
	 * Method to help us get dummy data
	 * 
	 * @return list of candidates
	 */
	public static List<Candidate> getCandidates() {
		var candidateList = List.of(
				
				new Candidate("rhea abou rached", 222730, Set.of("python", "c sharp", "docker")));

		return candidateList;
	}
}
