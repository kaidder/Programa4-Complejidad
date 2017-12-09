/**
 * Cuarto programa de Complejidad Computacional 2018-1
 * @author David Felipe Hernandez Chiapa
 */

 import java.util.Random;
 import java.util.ArrayList;

import org.graphstream.graph.*;

public class ColoringAnts {

    private Random rand;
    private int numVertices;
    private int[][] matriz;
    private Graph grafica;
    private ArrayList<Vertice> vertices;

    public ColoringAnts() {
        grafica = new SingleGraph("k-Coloracion.");
        rand = new Random();
        numVertices = rand.nextInt();
        vertices = new ArrayList<>();
        if(numVertices < 5){//asegurando que la grafica tenga al menos 5 vertices.
            numVertices = 5;
        }
        for (int i = 0; i < numVertices; i++) {
            grafica.addNode(Integer.toString(i));
            Vertice v = new Vertice(i,0);
            vertices.add(v);
        }

        //Llenado de matriz de adyacencias.
        //Aleatoriamente.
        matriz = new int[numVertices][numVertices];
        for(int i = 0; i < numVertices; i++)
            for(int j = i; j < numVertices; j++)
                if(i == j){
                    matriz[i][j] = 0;
                }else{
                    if(rand.nextGaussian() < 0.6){
                        matriz[i][j] = 1;
                        g.addEdge(i+"-"+j,i,j);
                    }else{
                        matriz[i][j] = 0;
                    }
                }
        for(int i = 0; i < numVertices; i++)
            for(int j = 0; j < numVertices; j++)
                matriz[j][i] = matriz[i][j];

    }

    private class Vertice {

        private int id;
        private int color;

        public Vertice(int id, int color) {
            this.id = id;
            this.color = color;
        }

        public int getId() {
            return id;
        }

        public int getColor() {
            return color;
        }
    }

    private ArrayList<Vertice> createPorR(int color,boolean p) {
        ArrayList<Vertice> p = new ArrayList<>();
        for(Vertice v: vertices) {
            if(v.getColor() == 0) {//no tiene color
                int id = v.getId();
                for(int vec = 0; vec < matriz[id].size; vec++) {
                    if(matriz[id][vec] != 0) {//es adyacente
                        Vertice vecino = vertices.get(vec);
                        if(p) {
                            vecino.getColor()
                        } else {

                        }
                    }
                }
            }
        }

        return p;
    }

    private int coloreaInicial() {
        int k = 1;
        ArrayList<Vertice> p = new ArrayList<>();
        ArrayList<Vertice> r = new ArrayList<>();


        while(!p.isEmpty()) {

        }

        return k;
    }
}
