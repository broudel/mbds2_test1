package mbds2.test1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbds2.test1.entity.Etudiant;
import mbds2.test1.repository.EtudiantRepository;
@Service

public class EtudiantService implements IEtudiantService {
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant getEtudiantById(long EtudiantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEtudiant(long etudiantId) {
		// TODO Auto-generated method stub
		
	}

}
