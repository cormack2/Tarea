public class CasoVotantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int arrayN;
	        double votacionh,votacionm;
	        arrayN = (int)(Math.random()*400)+100;
	        char[][] matriz = new char[2][arrayN];
	        double apruenh = 0;
	        double apruenm = 0;
	        double repruenm = 0;
	        for(int i=0;i<arrayN;i++){
	            votacionh = Math.random();
	            votacionm = Math.random();
	            if(votacionh<0.33){
	                matriz[0][i] = '1';
	            }else{
	                if(votacionh<0.66){
	                    matriz[0][i] = '0';
	                }else{
	                    if(votacionh<=1){
	                        matriz[0][i] = 'n';
	                }
	            }
	            if(votacionm<0.33){
	                matriz[1][i] = '1';
	            }else{
	                if(votacionm<0.66){
	                    matriz[1][i] = '0';
	                }else{
	                    if(votacionm<=1){
	                        matriz[1][i] = 'n';
	                    }    
	                }
	            }
	        }
	        }
	        for(int i=0;i<2;i++){
	            for(int j=0;j<arrayN;j++){
	                if(matriz[0][j]=='1'){
	                    apruenh = apruenh+1;
	                }
	                if(matriz[1][j]=='1'){
	                    apruenm = apruenm+1;
	                }
	                if(matriz[1][j]=='0'){
	                    repruenm = repruenm+1;
	                }
	            }
	        }
	        System.out.println("Hombres que aprueban la gestion del gobierno: "+apruenh);
	        System.out.println("Mujeres que desaprueban la gestion del gobierno: "+repruenm);
	        System.out.println("Porcentaje que aprueba la gestión del gobierno: "+((apruenh+apruenm)/(2*arrayN)*100)+"%");
	        System.out.println("Cantidad de personas que participaron en la encuesta: "+(2*arrayN));

	}

}
