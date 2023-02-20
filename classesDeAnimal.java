class AnimalGeral {
	public void animalSom() {
		System.out.println("Som indefinido");
	}
}

class Porco extends AnimalGeral {
	public void animalSom() {
		System.out.println("oinc oinc");
	}
}

class Cachorro extends AnimalGeral {
	public void animalSom() {
		System.out.println("auau auau");
	}
}

class classesDeAnimal {
	public static void main(String[] args) {
		
		AnimalGeral objAnimal = new AnimalGeral();
		objAnimal.animalSom();
		
		AnimalGeral objPorco = new Porco();
		objPorco.animalSom();
		
		AnimalGeral objCachorro = new Cachorro();
		objCachorro.animalSom();
	}
}