package dataStructures.graph;

import dataStructures.queue.Queue;
import dataStructures.stack.Stack;

public class Graph {
    Vertex[] vertexList; //массив, который хранит вершины
    int[][] matrix; // матрица смежности
    int maxVertex = 32; //максимальное количество вершин, которое может быть представлено в графе
    int size; // текущее количество вершин

    Stack stack;
    Queue queue;

    public Graph() {
        queue = new Queue(maxVertex);
        stack = new Stack(maxVertex);
        vertexList = new Vertex[maxVertex];
        matrix = new int[maxVertex][maxVertex];
        size = 0;
    }

    //добавление ребра между вершинами
    public void addEdge(int one, int two) {
        matrix[one][two] = 1;
        matrix[two][one] = 1;
    }

    //добавление вершины в граф
    public void addVertex(char label) {
        vertexList[size++] = new Vertex(label);
    }

    // вывод в консоль наименования вершины
    public void displayVertex(int vertex) {
        System.out.println(vertexList[vertex].label);
    }

    //depth-first search обход в глубину
    /*проверяется элемент на вершине стека, находятся непосещенные соседи;
    если их нет, элемент извлекается из стека, а если вершина найдена — алгоритм помещает ее в стек.
    */
    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitedVertex((int) stack.peek());
            if (v == -1)
                stack.pop();
            else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //breadth-first search
    public void bfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.insert(0);
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitedVertex(v)) != -1) {
                vertexList[w].wasVisited = true;
                displayVertex(w);
                queue.insert(w);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    /*    Для реализации обхода необходимо найти непосещенную смежную вершину.
    При помощи матрицы смежности алгоритм просматривает строку заданной вершины и отбирает столбцы со значением 1.
     По номеру столбца определяется номер смежной вершины. После производится проверка, посещалась вершина или нет.
Если вершина не проверялась, значит искомая вершина найдена, в ином случае смежных непосещенных вершин не осталось.
     */

    private int getUnvisitedVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if (matrix[ver][i] == 1 && !vertexList[i].wasVisited)
                return i;
        }
        return -1;
    }
}
