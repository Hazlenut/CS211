//package animals;

public class Dragon extends Animal{

	@Override
	public long calcScore() throws InedibleException {
		// TODO Auto-generated method stub
		long total = 0;
		for(Animal a: getAcquiredAnimals()) {
			if(a instanceof Dragon) {
				throw new InedibleException("Inedible");
			}else if(a instanceof Lion) {
				total+=500;
			}else if(a instanceof Bird) {
				total+=250;
			}else if(a instanceof Rabbit) {
				total+=100;
			}
		}
		return total;
	}

	@Override
	public void store(Animal animal) {
		getAcquiredAnimals().add(animal);
		
	}

}
