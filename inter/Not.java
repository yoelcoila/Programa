package inter; // Archivo Not.java

import analizadorLexico.*;
import simbolos.*;

public class Not extends Logica {
    public Not(Token tok, Expr x2) {
        super(tok, x2, x2);
    }

    public void salto(int t, int f) {
        expr2.salto(f, t);
    }

    public String toString() {
        return op.toString() + " " + expr2.toString();
    }
}
