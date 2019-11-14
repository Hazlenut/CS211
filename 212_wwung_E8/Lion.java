//package animals;
import java.util.*;
public class Lion extends Animal{
	
	public Lion() {
		
	}
	@Override
	public long calcScore() throws InedibleException{
		// TODO Auto-generated method stub
		long total = 0;
		for(Animal a: getAcquiredAnimals()) {
			if(a instanceof Dragon) {
				total+=1000;
			}else if(a instanceof Lion) {
				throw new InedibleException("Inedible");
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
		// TODO Auto-generated method stub
		getAcquiredAnimals().add(animal);
	}


}
