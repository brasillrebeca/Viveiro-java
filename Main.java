import java.util.Scanner;

// Princípio da Responsabilidade Única (SRP): A classe Main tem a responsabilidade de executar o menu e manipular as interações com o usuário.
// Idealmente, a lógica do menu e a lógica dos dados (como a manipulação de plantas, serviços, vasos, ferramentas e adubos) devem ser separadas.

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando instâncias das classes com exemplos de dados
        Planta planta = new Planta("Rosa", 10, 15.0);
        Arvore carvalho = new Arvore("Carvalho", 5, 100.0);

        Servico poda = new Poda("Poda de árvore", 50.0, 5);
        Vaso vaso = new VasoDeCeramica("Cerâmica", 15, 20.0);
        Ferramenta tesoura = new Tesoura("Tesoura de poda", 5, 30.0);
        Adubo adubo = new AduboOrganico("Orgânico", 20, 10.0);

        while (true) {
            // Exibe as atualizações dos itens
            exibirAtualizacoes(planta, poda, vaso, tesoura, adubo);

            // Exibe o menu principal para seleção do item que deseja editar
            System.out.println("Bem-vindo ao controle de produtos e serviços do Viveiro | Selecione a categoria do item que deseja editar:");
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
                    // Menu interno para seleção do tipo de planta
                    System.out.println("Selecione o tipo de planta:");
                    System.out.println("1. Árvore");
                    System.out.print("Selecione uma opção: ");
                    int tipoPlanta = scanner.nextInt();
                    
                    switch (tipoPlanta) {
                        case 1:
                            // Manipulação para a subclasse Arvore
                            System.out.println("Árvore selecionada: " + carvalho.nome);
                            System.out.println("Quantidade atual: " + carvalho.quantidade);
                            System.out.println("Preço atual: " + carvalho.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeArvore = scanner.next().charAt(0);
                            if (respostaQuantidadeArvore == 's' || respostaQuantidadeArvore == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                carvalho.quantidade = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoArvore = scanner.next().charAt(0);
                            if (respostaPrecoArvore == 's' || respostaPrecoArvore == 'S') {
                                System.out.print("Digite o novo preço: ");
                                carvalho.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + carvalho.nome + ": " + carvalho.quantidade);
                            System.out.println("Novo preço de " + carvalho.nome + ": " + carvalho.preco);

                            System.out.println("Informações adicionais sobre a árvore:");
                            carvalho.regar();   // Regar a árvore
                            carvalho.podar();   // Podar a árvore
                            carvalho.fertilizar();  // Fertilizar a árvore
                            carvalho.transplantar();  // Transplantar a árvore
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 2:
                    // Menu interno para seleção do tipo de serviço
                    System.out.println("Selecione o tipo de serviço:");
                    System.out.println("1. Poda");
                    System.out.print("Selecione uma opção: ");
                    int tipoServico = scanner.nextInt();

                    switch (tipoServico) {
                        case 1:
                            // Manipulação para a subclasse Poda
                            System.out.println("Poda selecionada: " + poda.descricao);
                            System.out.println("Quantidade atual: " + poda.quantidade);
                            System.out.println("Preço atual: " + poda.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadePoda = scanner.next().charAt(0);
                            if (respostaQuantidadePoda == 's' || respostaQuantidadePoda == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                poda.quantidade = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoPoda = scanner.next().charAt(0);
                            if (respostaPrecoPoda == 's' || respostaPrecoPoda == 'S') {
                                System.out.print("Digite o novo preço: ");
                                poda.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + poda.descricao + ": " + poda.quantidade);
                            System.out.println("Novo preço de " + poda.descricao + ": " + poda.preco);

                            System.out.println("Informações adicionais sobre a poda:");
                            ((Poda) poda).iniciar();  // Iniciar a poda
                            ((Poda) poda).finalizar();  // Finalizar a poda
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 3:
                    // Menu interno para seleção do tipo de vaso
                    System.out.println("Selecione o tipo de vaso:");
                    System.out.println("1. Vaso de Cerâmica");
                    System.out.print("Selecione uma opção: ");
                    int tipoVaso = scanner.nextInt();

                    switch (tipoVaso) {
                        case 1:
                            // Manipulação para a subclasse VasoDeCeramica
                            System.out.println("Vaso de Cerâmica selecionado: " + vaso.material);
                            System.out.println("Quantidade atual: " + vaso.quantidade);
                            System.out.println("Preço atual: " + vaso.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeVasoCeramica = scanner.next().charAt(0);
                            if (respostaQuantidadeVasoCeramica == 's' || respostaQuantidadeVasoCeramica == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                vaso.quantidade = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoVasoCeramica = scanner.next().charAt(0);
                            if (respostaPrecoVasoCeramica == 's' || respostaPrecoVasoCeramica == 'S') {
                                System.out.print("Digite o novo preço: ");
                                vaso.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de vasos de " + vaso.material + ": " + vaso.quantidade);
                            System.out.println("Novo preço de vasos de " + vaso.material + ": " + vaso.preco);

                            System.out.println("Informações adicionais sobre o vaso de cerâmica:");
                            ((VasoDeCeramica) vaso).pintar();  // Pintar o vaso
                            ((VasoDeCeramica) vaso).quebrar();  // Quebrar o vaso
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 4:
                    // Menu interno para seleção do tipo de ferramenta
                    System.out.println("Selecione o tipo de ferramenta:");
                    System.out.println("1. Tesoura");
                    System.out.print("Selecione uma opção: ");
                    int tipoFerramenta = scanner.nextInt();

                    switch (tipoFerramenta) {
                        case 1:
                            // Manipulação para a subclasse Tesoura
                            System.out.println("Tesoura selecionada: " + tesoura.nome);
                            System.out.println("Quantidade atual: " + tesoura.quantidadeEmEstoque);
                            System.out.println("Preço atual: " + tesoura.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeTesoura = scanner.next().charAt(0);
                            if (respostaQuantidadeTesoura == 's' || respostaQuantidadeTesoura == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                tesoura.quantidadeEmEstoque = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoTesoura = scanner.next().charAt(0);
                            if (respostaPrecoTesoura == 's' || respostaPrecoTesoura == 'S') {
                                System.out.print("Digite o novo preço: ");
                                tesoura.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + tesoura.nome + ": " + tesoura.quantidadeEmEstoque);
                            System.out.println("Novo preço de " + tesoura.nome + ": " + tesoura.preco);

                            System.out.println("Informações adicionais sobre a tesoura:");
                            ((Tesoura) tesoura).cortar();  // Cortar com a tesoura
                            ((Tesoura) tesoura).afiar();  // Afiar a tesoura
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 5:
                    // Menu interno para seleção do tipo de adubo
                    System.out.println("Selecione o tipo de adubo:");
                    System.out.println("1. Adubo Orgânico");
                    System.out.print("Selecione uma opção: ");
                    int tipoAdubo = scanner.nextInt();

                    switch (tipoAdubo) {
                        case 1:
                            // Manipulação para a subclasse AduboOrganico
                            System.out.println("Adubo Orgânico selecionado: " + adubo.tipo);
                            System.out.println("Quantidade atual: " + adubo.quantidadeKg);
                            System.out.println("Preço atual: " + adubo.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeAduboOrganico = scanner.next().charAt(0);
                            if (respostaQuantidadeAduboOrganico == 's' || respostaQuantidadeAduboOrganico == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                adubo.quantidadeKg = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoAduboOrganico = scanner.next().charAt(0);
                            if (respostaPrecoAduboOrganico == 's' || respostaPrecoAduboOrganico == 'S') {
                                System.out.print("Digite o novo preço: ");
                                adubo.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + adubo.tipo + ": " + adubo.quantidadeKg);
                            System.out.println("Novo preço de " + adubo.tipo + ": " + adubo.preco);

                            System.out.println("Informações adicionais sobre o adubo orgânico:");
                            ((AduboOrganico) adubo).compostar();  // Compostar o adubo
                            ((AduboOrganico) adubo).reciclar();  // Reciclar o adubo
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 6:
                    // Sair do programa
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    // Método para exibir as atualizações dos produtos e serviços
    // Princípio da Responsabilidade Única (SRP): Este método é responsável apenas por exibir as informações dos produtos e serviços.
    public static void exibirAtualizacoes(Planta arvore, Servico poda, Vaso vaso, Ferramenta tesoura, Adubo adubo) {
        System.out.println("Produtos e serviços hoje:");
        System.out.println("Classe: Planta | Item: " + arvore.nome + " | Quantidade: " + arvore.quantidade + " | Preço/unidade: " + arvore.preco);
        System.out.println("Classe: Serviço | Item: " + poda.descricao + " | Quantidade: " + poda.quantidade + " | Preço/unidade: " + poda.preco);
        System.out.println("Classe: Vaso | Item: " + vaso.material + " | Quantidade: " + vaso.quantidade + " | Preço/unidade: " + vaso.preco);
        System.out.println("Classe: Ferramenta | Item: " + tesoura.nome + " | Quantidade: " + tesoura.quantidadeEmEstoque + " | Preço/unidade: " + tesoura.preco);
        System.out.println("Classe: Adubo | Item: " + adubo.tipo + " | Quantidade: " + adubo.quantidadeKg + " | Preço/unidade: " + adubo.preco);
        System.out.println();
    }
}

// Princípio da Aberto/Fechado (OCP): As classes Planta, Servico, Vaso, Ferramenta e Adubo são projetadas para permitir extensões sem modificar o código existente.
