
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Planta planta = new Planta("Rosa", 10, 15.0);
        Servico servico = new Servico("Poda de árvore", 50.0, 5);
        Vaso vaso = new Vaso("Cerâmica", 15, 20.0);
        Ferramenta ferramenta = new Ferramenta("Tesoura de poda", 5, 30.0);
        Adubo adubo = new Adubo("Orgânico", 20, 10.0);

        while (true) {
            exibirEstoque(planta, servico, vaso, ferramenta, adubo);

            System.out.println("Bem vinco ao controle de estoque do Viveiro | Selecione a categoria do item que deseja editar:");
            System.out.println("1. Planta");
            System.out.println("2. Serviço");
            System.out.println("3. Vaso");
            System.out.println("4. Ferramenta");
            System.out.println("5. Adubo");
            System.out.println("6. Sair");
            System.out.print("Selecione uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Planta selecionada: " + planta.nome);
                System.out.println("Quantidade atual: " + planta.quantidade);
                System.out.println("Preço atual: " + planta.preco);
        
                System.out.print("Deseja atualizar a quantidade? (s/n): ");
                char respostaQuantidade = scanner.next().charAt(0);
                if (respostaQuantidade == 's' || respostaQuantidade == 'S') {
                    System.out.print("Digite a nova quantidade: ");
                    planta.quantidade = scanner.nextInt();
                }
        
                System.out.print("Deseja atualizar o preço? (s/n): ");
                char respostaPreco = scanner.next().charAt(0);
                if (respostaPreco == 's' || respostaPreco == 'S') {
                    System.out.print("Digite o novo preço: ");
                    planta.preco = scanner.nextDouble();
                }
        
                System.out.println("Nova quantidade de " + planta.nome + ": " + planta.quantidade);
                System.out.println("Novo preço de " + planta.nome + ": " + planta.preco);
                break;

                case 2:
                    System.out.println("Serviço selecionado: " + servico.descricao);
                    System.out.println("Quantidade atual: " + servico.quantidade);
                    System.out.println("Preço atual: " + servico.preco);
                    System.out.print("Digite a nova quantidade: ");
                    servico.quantidade = scanner.nextInt();
                    System.out.print("Digite o novo preço: ");
                    servico.preco = scanner.nextDouble();
                    System.out.println("Nova quantidade de " + servico.descricao + ": " + servico.quantidade);
                    System.out.println("Novo preço de " + servico.descricao + ": " + servico.preco);
                    break;
                case 3:
                    System.out.println("Vaso selecionado: " + vaso.material);
                    System.out.println("Quantidade atual: " + vaso.quantidade);
                    System.out.println("Preço atual: " + vaso.preco);
                    System.out.print("Digite a nova quantidade: ");
                    vaso.quantidade = scanner.nextInt();
                    System.out.print("Digite o novo preço: ");
                    vaso.preco = scanner.nextDouble();
                    System.out.println("Nova quantidade de vasos de " + vaso.material + ": " + vaso.quantidade);
                    System.out.println("Novo preço de vasos de " + vaso.material + ": " + vaso.preco);
                    break;
                case 4:
                    System.out.println("Ferramenta selecionada: " + ferramenta.nome);
                    System.out.println("Quantidade atual: " + ferramenta.quantidadeEmEstoque);
                    System.out.println("Preço atual: " + ferramenta.preco);
                    System.out.print("Digite a nova quantidade: ");
                    ferramenta.quantidadeEmEstoque = scanner.nextInt();
                    System.out.print("Digite o novo preço: ");
                    ferramenta.preco = scanner.nextDouble();
                    System.out.println("Nova quantidade de " + ferramenta.nome + ": " + ferramenta.quantidadeEmEstoque);
                    System.out.println("Novo preço de " + ferramenta.nome + ": " + ferramenta.preco);
                    break;
                case 5:
                    System.out.println("Adubo selecionado: " + adubo.tipo);
                    System.out.println("Quantidade atual: " + adubo.quantidadeKg);
                    System.out.println("Preço atual: " + adubo.preco);
                    System.out.print("Digite a nova quantidade: ");
                    adubo.quantidadeKg = scanner.nextInt();
                    System.out.print("Digite o novo preço: ");
                    adubo.preco = scanner.nextDouble();
                    System.out.println("Nova quantidade de " + adubo.tipo + ": " + adubo.quantidadeKg);
                    System.out.println("Novo preço de " + adubo.tipo + ": " + adubo.preco);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void exibirEstoque(Planta planta, Servico servico, Vaso vaso, Ferramenta ferramenta, Adubo adubo) {
        System.out.println("Estoque Atual:");
        System.out.println("Classe: Planta | Item: " + planta.nome + " | Quantidade: " + planta.quantidade + " | Preço/unidade: " + planta.preco);
        System.out.println("Classe: Planta | Item: " + planta.nome + " | Quantidade: " + planta.quantidade + " | Preço/unidade: " + planta.preco);
        System.out.println("Classe: Serviço | Item: " + servico.descricao + " | Quantidade: " + servico.quantidade + " | Preço/unidade: " + servico.preco);
        System.out.println("Classe: Vaso | Item: " + vaso.material + " | Quantidade: " + vaso.quantidade + " | Preço/unidade: " + vaso.preco);
        System.out.println("Classe: Ferramenta | Item: " + ferramenta.nome + " | Quantidade: " + ferramenta.quantidadeEmEstoque + " | Preço/unidade: " + ferramenta.preco);
        
        System.out.println();
    }
}