package top10;

public class Top10Info2D {


    // get the 2D array with the movies info in constructor
	Top10Info2D() {
		this.enterMoviesInfo(new Top10TitlesArr().getMovies());
	}
	
	// create a 2D array 	
	private String[][] moviesInfo = new String[10][4];
	
	// method to enter info for each movie title
	private String[][] enterMoviesInfo(String[] titles){

		for(int i = 0; i < titles.length; i++){
			
			moviesInfo[i][0] = titles[i];			
			
			if( i == 0 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Harrison Ford, Ryan Gosling, Ana de Armas";
				moviesInfo[i][3] = "8.1";
			}
			else if( i == 1 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Chris Hemsworth, Tom Hiddleston, Cate Blanchett";
				moviesInfo[i][3] = "7.9";
			}
			else if( i == 2 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Michael Fassbender, Katherine Waterston, Billy Crudup";
				moviesInfo[i][3] = "6.4";
			}
			else if( i == 3 ){
				moviesInfo[i][1] = "2016";
				moviesInfo[i][2] = "James McAvoy, Anya Taylor-Joy, Haley Lu Richardson";
				moviesInfo[i][3] = "7.3";
			}
			else if( i == 4 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Ben Affleck, Gal Gadot, Jason Momoa";
				moviesInfo[i][3] = "6.7";
			}
			else if( i == 5 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Chris Pratt, Zoe Saldana, Dave Bautista";
				moviesInfo[i][3] = "7.7";
			}
			else if( i == 6 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Hugh Jackman, Patrick Stewart, Dafne Keen";
				moviesInfo[i][3] = "8.1";
			}
			else if( i == 7 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Emma Watson, Dan Stevens, Luke Evans";
				moviesInfo[i][3] = "7.2";
			}
			else if( i == 8 ){
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Gal Gadot, Chris Pine, Robin Wright";
				moviesInfo[i][3] = "7.5";
			}
			else{
				moviesInfo[i][1] = "2017";
				moviesInfo[i][2] = "Bill Skarsgård, Jaeden Lieberher, Finn Wolfhard";
				moviesInfo[i][3] = "7.5";
			}
						
		}
		
		return this.moviesInfo;
		
	}
	
	public void printMoviesInfo(){
		
		System.out.println("------------------------------------------");
		System.out.println("*        Print movies information        *");
		System.out.println("------------------------------------------");
		
		for (int i = 0; i < moviesInfo.length; i++ ){
			
			System.out.println( i + 1 );
			System.out.println("------------------------------------------");
				
			for ( int j = 0; j < moviesInfo[i].length; j++ ){
				
				
				
				if(j ==0 ){
					System.out.println("Title: " + moviesInfo[i][j]);
				}
				else if(j == 1){
					System.out.println("Year: " + moviesInfo[i][j]);
				}
				else if(j == 2){
					System.out.println("Stars: " + moviesInfo[i][j]);
				}
				else{
					System.out.println("Rating: " + moviesInfo[i][j]);
				}
											
			}
			
			System.out.println("------------------------------------------");
			
		}
		
	}
	
	

	////// Getters & Setters
	
	public String[][] getMoviesInfo() {
		return moviesInfo;
	}

	public void setMoviesInfo(String[][] moviesInfo) {
		this.moviesInfo = moviesInfo;
	}
	
	

}
