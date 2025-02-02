package game;

import java.util.Scanner;

public class Game {
    private int[][] initialValues;
    private String[][] initialVisibility;

    public Game() {
    }

    public Game(int[][] initialValues, String[][] initialVisibility) {
        this.initialValues = initialValues;
        this.initialVisibility = initialVisibility;
    }

    public int[][] getInitialValues() {
        return initialValues;
    }

    public void setInitialValues(int[][] initialValues) {
        this.initialValues = initialValues;
    }

    public String[][] getInitialVisibility() {
        return initialVisibility;
    }

    public void setInitialVisibility(String[][] initialVisibility) {
        this.initialVisibility = initialVisibility;
    }


    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        int[][] initialValues;
        String[][] initialVisibility;
        Games games = Games.getInstance();
        Game game = games.getGame(1);

        initialValues = game.getInitialValues();
        initialVisibility = game.getInitialVisibility();


        SudokuGameManager gameManager = new SudokuGameManager(initialValues, initialVisibility);

        while (true) {
            System.out.println("\n--- Sudoku ---");
            gameManager.displayCurrentBoard();

            if (gameManager.isGameComplete()) {
                System.out.println("Parabéns! Você completou o Sudoku!");
                break;
            }

            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar número");
            System.out.println("2. Remover número");
            System.out.println("3. Reiniciar jogo");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int choice;

            try {
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.print("Linha (1-9): ");
                    int row = scanner.nextInt();
                    System.out.print("Coluna (1-9): ");
                    int col = scanner.nextInt();
                    System.out.print("Número (1-9): ");
                    int value = scanner.nextInt();

                    if (gameManager.addNumber(row, col, value)) {
                        System.out.println("Número adicionado com sucesso!");
                    } else {
                        System.out.println("Não foi possível adicionar o número. Tente novamente.");
                    }

                } else if (choice == 2) {
                    System.out.print("Linha (0-8): ");
                    int row = scanner.nextInt();
                    System.out.print("Coluna (0-8): ");
                    int col = scanner.nextInt();

                    if (gameManager.removeNumber(row, col)) {
                        System.out.println("Número removido com sucesso!");
                    } else {
                        System.out.println("Não foi possível remover o número. Tente novamente.");
                    }

                } else if (choice == 3) {
                    gameManager.restartGame();
                    System.out.println("Jogo reiniciado.");

                } else if (choice == 4) {
                    System.out.println("Saindo do jogo. Até a próxima!");
                    break;

                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
