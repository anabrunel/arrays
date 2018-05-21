package top10;

public class Top10TitlesArr {
	
	// Declare array --> name: movies | type: String
	
		private String[] movies; // or private String movies[];
		
		Top10TitlesArr() {		
			this.topTenMovies();
		}

		private String[] topTenMovies(){
		
			// Create array movies with the new operator | must define the length (here it is 10)
			
			this.movies = new String[10];
					
			// Initialise array movies --> assign values to each element
			
			this.movies[0] = "Blade Runner 2049";
			this.movies[1] = "Thor: Ragnarok";
			this.movies[2] = "Alien: Covenant";
			this.movies[3] = "Split";
			this.movies[4] = "Justice League";
			this.movies[5] = "Guardians of the Galaxy Vol. 2";
			this.movies[6] = "Logan";
			this.movies[7] = "Beauty and the Beast";
			this.movies[8] = "Wonder Woman";
			this.movies[9] = "It";
			
			return this.movies;
			
		}
		
		// Declare & create array --> name: movies | type: String | elements: in { } separated by comma
		
		private String[] mmovies ={"Blade Runner 2049", "Thor: Ragnarok", "Alien: Covenant", "Split", 
				"Justice League", "Guardians of the Galaxy Vol. 2", "Logan", "Beauty and the Beast", 
				"Wonder Woman", "It"}; 
		
		/**
		 * Or
		 * 
		 * private String mmovies[] ={"Blade Runner 2049", "Thor: Ragnarok", "Alien: Covenant", "Split", 
		 *		"Justice League", "Guardians of the Galaxy Vol. 2", "Logan", "Beauty and the Beast", 
		 *		"Wonder Woman", "It"}; 
		 **/

		
		/// USING ARRAYS
		
		//Access array elements one-by-one
		
		public void printMovies_obo(){
			
			System.out.println("------------------------------------------");
			System.out.println("* Print movies array elements one-by-one *");
			System.out.println("------------------------------------------");
			
			System.out.println("Element 1 at index 0: " + movies[0]);
			System.out.println("Element 2 at index 1: " + movies[1]);
			System.out.println("Element 3 at index 2: " + movies[2]);
			System.out.println("Element 4 at index 3: " + movies[3]);
			System.out.println("Element 5 at index 4: " + movies[4]);
			System.out.println("Element 6 at index 5: " + movies[5]);
			System.out.println("Element 7 at index 6: " + movies[6]);
			System.out.println("Element 8 at index 7: " + movies[7]);
			System.out.println("Element 9 at index 8: " + movies[8]);
			System.out.println("Element 10 at index 9: " + movies[9]);
			
		}
		
		//Access array elements iteratively 
		
		public void printMovies_iter(){

			System.out.println("-------------------------------------------");
			System.out.println("* Print movies array elements iteratively *");
			System.out.println("-------------------------------------------");
			
			for ( int i = 0; i < movies.length; i++ ){
				System.out.println("Element " + ( i + 1 ) + " at index " + i + ": " + movies[i]);
			}
		
		}
		
		
		////// Getters & Setters
			
		public String[] getMovies() {
			return movies;
		}

		public void setMovies(String[] movies) {
			this.movies = movies;
		}
	

}
