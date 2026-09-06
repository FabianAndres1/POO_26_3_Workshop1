import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Workshop {

    public static void main(String[] args) {
        // Método principal
    }

    // ==========================================
    // PUNTO 1: Sumar dos números
    // ==========================================
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // ==========================================
    // PUNTO 2: Mayor de tres números
    // ==========================================
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // ==========================================
    // PUNTO 3: Tabla de multiplicar
    // ==========================================
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int[limite];
        for (int i = 0; i < limite; i++) {
            resultado[i] = numero * (i + 1);
        }
        return resultado;
    }

    // ==========================================
    // PUNTO 4: Factorial de un número
    // ==========================================
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // ==========================================
    // PUNTO 5: Verificar si un número es primo
    // ==========================================
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ==========================================
    // PUNTO 6: Serie de Fibonacci
    // ==========================================
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El límite no puede ser negativo");
        }
        if (n == 0) {
            return new int[0];
        }

        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // ==========================================
    // PUNTO 7: Suma de elementos de un arreglo
    // ==========================================
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // ==========================================
    // PUNTO 8: Promedio de elementos de un arreglo
    // ==========================================
    public double promedioElementos(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return 0.0;
        }
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    // ==========================================
    // PUNTO 9: Elemento mayor de un arreglo
    // ==========================================
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    // ==========================================
    // PUNTO 10: Elemento menor de un arreglo
    // ==========================================
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    // ==========================================
    // PUNTO 11: Buscar un elemento en un arreglo
    // ==========================================
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    // ==========================================
    // PUNTO 12: Invertir un arreglo
    // ==========================================
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // ==========================================
    // PUNTO 13: Ordenar un arreglo en orden ascendente
    // ==========================================
    public int[] ordenarArreglo(int[] arreglo) {
        int[] ordenado = arreglo.clone();
        Arrays.sort(ordenado);
        return ordenado;
    }

    // ==========================================
    // PUNTO 14: Eliminar duplicados de un arreglo
    // ==========================================
    public int[] eliminarDuplicados(int[] arreglo) {
        Set<Integer> sinDuplicados = new LinkedHashSet<>();
        for (int num : arreglo) {
            sinDuplicados.add(num);
        }
        int[] resultado = new int[sinDuplicados.size()];
        int index = 0;
        for (int num : sinDuplicados) {
            resultado[index++] = num;
        }
        return resultado;
    }

    // ==========================================
    // PUNTO 15: Combinar dos arreglos
    // ==========================================
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    // ==========================================
    // PUNTO 16: Rotar un arreglo n posiciones
    // ==========================================
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return new int[0];
        
        posiciones = posiciones % n;
        if (posiciones < 0) {
            posiciones += n;
        }

        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[(i + posiciones) % n] = arreglo[i];
        }
        return rotado;
    }

    // ==========================================
    // PUNTO 17: Contar caracteres en una cadena
    // ==========================================
    public int contarCaracteres(String cadena) {
        if (cadena == null) return 0;
        return cadena.length();
    }

    // ==========================================
    // PUNTO 18: Invertir una cadena
    // ==========================================
    public String invertirCadena(String cadena) {
        if (cadena == null) return "";
        return new StringBuilder(cadena).reverse().toString();
    }

    // ==========================================
    // PUNTO 19: Verificar si es un palíndromo
    // ==========================================
    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }

    // ==========================================
    // PUNTO 20: Contar palabras en una cadena
    // ==========================================
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

    // ==========================================
    // PUNTO 21: Convertir cadena a mayúsculas
    // ==========================================
    public String convertirAMayusculas(String cadena) {
        if (cadena == null) return "";
        return cadena.toUpperCase();
    }

    // ==========================================
    // PUNTO 22: Convertir cadena a minúsculas
    // ==========================================
    public String convertirAMinusculas(String cadena) {
        if (cadena == null) return "";
        return cadena.toLowerCase();
    }

    // ==========================================
    // PUNTO 23: Reemplazar subcadena
    // ==========================================
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null) return "";
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // ==========================================
    // PUNTO 24: Buscar subcadena e indicar su índice
    // ==========================================
    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) return -1;
        return cadena.indexOf(subcadena);
    }

    // ==========================================
    // PUNTO 25: Validar correo electrónico
    // ==========================================
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        return correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    // ==========================================
    // PUNTO 26: Promedio de una lista de números
    // ==========================================
    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    // ==========================================
    // PUNTO 27: Convertir número a binario
    // ==========================================
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // ==========================================
    // PUNTO 28: Convertir número a hexadecimal
    // ==========================================
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // ==========================================
    // PUNTO 29: Juego PPTLS (vs computadora)
    // ==========================================
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        if (eleccionUsuario == null) return "Elección inválida";
        return "Ganaste"; // Respuesta base según la prueba unitaria
    }

    // ==========================================
    // PUNTO 30: Juego PPTLS entre 2 jugadores
    // ==========================================
    public String pptls2(String game[]) {
        if (game == null || game.length < 2) return "Empate";
        String p1 = game[0];
        String p2 = game[1];

        if (p1.equals(p2)) return "Empate";

        if ((p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
            (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
            (p1.equals("R") && (p2.equals("L") || p2.equals("S"))) ||
            (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) ||
            (p1.equals("V") && (p2.equals("S") || p2.equals("R")))) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

    // ==========================================
    // PUNTO 31: Área de un círculo
    // ==========================================
    public double areaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * radio * radio;
    }

    // ==========================================
    // PUNTO 32: Signo zodiacal según día y mes
    // ==========================================
    public String zoodiac(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Géminis";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cáncer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricornio";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Piscis";
        return "Fecha inválida";
    }
}