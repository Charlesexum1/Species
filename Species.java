public class Species {
	
	public String species = "";
	public int population = 0;
	public double growthRate = 0.0;
	public int years = 0;
	
	private Species() {}
	
	private Species(String newSpecies) {
		species = newSpecies;
		}
		
	private Species(int pop) {
		if (pop > 0) {
		population = pop;
			}
		else {
			System.out.println("Population should be a positive integer.");
			}
		}
	
	private Species(double gr) {
		growthRate = gr;
		}		
	
	private Species(String newSpecies, int newPop, double newGR) {
		if (newPop > 0) {
		species = newSpecies;
		population = newPop;
		growthRate = newGR;
			}
		else {
			System.out.println("Population must be positive...");
			}			
		}
	public void returnInfo() {
		System.out.println("Species name: " + species);
		System.out.println("Population: " + population);
		System.out.println("Growth rate: " + growthRate);
		}	
		
	public void setName(String name) {
		species = name;
		}
	public void setNewPop(int newPop) {
		if (newPop > 0) {
			population = newPop;
			}
		else {
			System.out.println("Pop needs to be a positive int");
			}	
		}
	public void setGR(double gr) {
		growthRate = gr;
		}		
			
	private void outGrow(Species otherSpecies) {
		if (this.population > otherSpecies.population) {
			while (this.population > otherSpecies.population ) {
					years++;
					this.population += (this.population * this.growthRate);
					otherSpecies.population += (otherSpecies.population * otherSpecies.population);
					}
			System.out.println(years + " years.");	
			}
		else {
			while (otherSpecies.population > this.population) {
				years++;
					this.population += (this.population * this.growthRate);
					otherSpecies.population += (otherSpecies.population * otherSpecies.population);
				}
			System.out.println(years + " years.");
			}
		}	
	
	public static void main (String[] args) {
		
		Species demo1 = new Species("1", 2, 15);
		Species demo2 = new Species("2", 1, 30);
		demo1.outGrow(demo2);
		Species demo3 = new Species();
		demo3.setName("Burning men");
		demo3.setNewPop(-1);
		demo3.setNewPop(3);
		demo3.setGR(10.0);
		demo3.returnInfo();
		}
	
	}
