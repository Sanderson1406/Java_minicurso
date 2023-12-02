package entidades3;

public class Idade {
public int a;
public int b;
public int c;

public int verificar() {
	if (a > b && b > c) {
		return b;
	} else if (b > a && a > c) {
		return a;
	} else if ( b > c && c > a) {
		return  c;
	}  else if ( c > b&& b > a) {
		return  b;
	}   else if ( a == c || c > b) {
		return  c;
	}else if ( c > a && a > b) {
		return  a;
	}  else if ( a > c && c > b) {
		return  c;
	}  else if ( a == b && c == b) {
		return  b;
	}  else if ( a == b &&b > c) {
		return  b;
	}  else if ( c == a && c > b) {
		return  c;
	}  else if ( c == b && c > a) {
		return  b;
	} else if ( a == b &&b < c) {
		return  b;
	}  else if ( c == a && c < b) {
		return  b;
	}  else if ( c == b && c < a) {
		return  b;
	}
	return 0;
};
}
