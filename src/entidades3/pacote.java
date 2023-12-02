package entidades3;

public class pacote {
int sobra;
int totalUsado;
public int total;
public int n;
public int Mi;

public int subtrair() {
	 for (int i = 0; i <n ; i++) {
         totalUsado += Mi; 
     }
     int megabytesRestantes = total - totalUsado;
     return megabytesRestantes;
}
}
