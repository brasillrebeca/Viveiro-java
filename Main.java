import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Planta planta = new Planta("Rosa", 10, 15.0);
        Arvore carvalho = new Arvore("Carvalho", 5, 100.0);

        Servico poda = new Poda("Poda de árvore", 50.0, 5);
        Vaso vaso = new VasoDeCeramica("Cerâmica", 15, 20.0);
        Ferramenta tesoura = new Tesoura("Tesoura de poda", 5, 30.0);
        Adubo adubo = new AduboOrganico("Orgânico", 20, 10.0);

        while (true) {
            
            exibirEstoque(planta, poda, vaso, tesoura, adubo);

            System.out.println("Bem-vindo ao controle de estoque do Viveiro | Selecione a categoria do item que deseja editar:");
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
                    // Menu interno para seleção de tipo de planta
                    System.out.println("Selecione o tipo de planta:");
                    System.out.println("1. Árvore");
                    System.out.print("Selecione uma opção: ");
                    int tipoPlanta = scanner.nextInt();
                    
                    switch (tipoPlanta) {
                        /*case 1:
                            // Manipulação para a classe Planta
                            System.out.println("Planta selecionada: " + rosa.nome);
                            System.out.println("Quantidade atual: " + rosa.quantidade);
                            System.out.println("Preço atual: " + rosa.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidade = scanner.next().charAt(0);
                            if (respostaQuantidade == 's' || respostaQuantidade == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                rosa.quantidade = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPreco = scanner.next().charAt(0);
                            if (respostaPreco == 's' || respostaPreco == 'S') {
                                System.out.print("Digite o novo preço: ");
                                rosa.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + rosa.nome + ": " + rosa.quantidade);
                            System.out.println("Novo preço de " + rosa.nome + ": " + rosa.preco);
                            break;*/

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
                            carvalho.regar();
                            carvalho.podar();
                            carvalho.fertilizar();
                            carvalho.transplantar();
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 2:
                    // Menu interno para seleção de tipo de serviço
                    System.out.println("Selecione o tipo de serviço:");
                    /*System.out.println("1. Serviço");*/
                    System.out.println("1. Poda");
                    System.out.print("Selecione uma opção: ");
                    int tipoServico = scanner.nextInt();

                    switch (tipoServico) {
                        /*case 1:
                            // Manipulação para a classe Servico
                            System.out.println("Serviço selecionado: " + poda.descricao);
                            System.out.println("Quantidade atual: " + poda.quantidade);
                            System.out.println("Preço atual: " + poda.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeServico = scanner.next().charAt(0);
                            if (respostaQuantidadeServico == 's' || respostaQuantidadeServico == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                poda.quantidade = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoServico = scanner.next().charAt(0);
                            if (respostaPrecoServico == 's' || respostaPrecoServico == 'S') {
                                System.out.print("Digite o novo preço: ");
                                poda.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + poda.descricao + ": " + poda.quantidade);
                            System.out.println("Novo preço de " + poda.descricao + ": " + poda.preco);

                            System.out.println("Informações adicionais sobre o serviço:");
                            poda.executar();
                            poda.cancelar();
                            break;*/

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
                            ((Poda) poda).iniciar();
                            ((Poda) poda).finalizar();
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 3:
                    // Menu interno para seleção de tipo de vaso
                    System.out.println("Selecione o tipo de vaso:");
                    /*System.out.println("1. Vaso");*/
                    System.out.println("1. Vaso de Cerâmica");
                    System.out.print("Selecione uma opção: ");
                    int tipoVaso = scanner.nextInt();

                    switch (tipoVaso) {
                        /*case 1:
                            // Manipulação para a classe Vaso
                            System.out.println("Vaso selecionado: " + vaso.material);
                            System.out.println("Quantidade atual: " + vaso.quantidade);
                            System.out.println("Preço atual: " + vaso.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeVaso = scanner.next().charAt(0);
                            if (respostaQuantidadeVaso == 's' || respostaQuantidadeVaso == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                vaso.quantidade = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoVaso = scanner.next().charAt(0);
                            if (respostaPrecoVaso == 's' || respostaPrecoVaso == 'S') {
                                System.out.print("Digite o novo preço: ");
                                vaso.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de vasos de " + vaso.material + ": " + vaso.quantidade);
                            System.out.println("Novo preço de vasos de " + vaso.material + ": " + vaso.preco);

                            System.out.println("Informações adicionais sobre o vaso:");
                            vaso.encher();
                            vaso.limpar();
                            break;*/

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
                            ((VasoDeCeramica) vaso).pintar();
                            ((VasoDeCeramica) vaso).quebrar();
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 4:
                    // Menu interno para seleção de tipo de ferramenta
                    System.out.println("Selecione o tipo de ferramenta:");
                    /*System.out.println("1. Ferramenta");*/
                    System.out.println("1. Tesoura");
                    System.out.print("Selecione uma opção: ");
                    int tipoFerramenta = scanner.nextInt();

                    switch (tipoFerramenta) {
                        /*case 1:
                            // Manipulação para a classe Ferramenta
                            System.out.println("Ferramenta selecionada: " + tesoura.nome);
                            System.out.println("Quantidade atual: " + tesoura.quantidadeEmEstoque);
                            System.out.println("Preço atual: " + tesoura.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeFerramenta = scanner.next().charAt(0);
                            if (respostaQuantidadeFerramenta == 's' || respostaQuantidadeFerramenta == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                tesoura.quantidadeEmEstoque = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoFerramenta = scanner.next().charAt(0);
                            if (respostaPrecoFerramenta == 's' || respostaPrecoFerramenta == 'S') {
                                System.out.print("Digite o novo preço: ");
                                tesoura.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + tesoura.nome + ": " + tesoura.quantidadeEmEstoque);
                            System.out.println("Novo preço de " + tesoura.nome + ": " + tesoura.preco);

                            System.out.println("Informações adicionais sobre a ferramenta:");
                            tesoura.usar();
                            tesoura.reparar();
                            break;*/

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
                            ((Tesoura) tesoura).cortar();
                            ((Tesoura) tesoura).afiar();
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
                    break;

                case 5:
                    // Menu interno para seleção de tipo de adubo
                    System.out.println("Selecione o tipo de adubo:");
                    /*System.out.println("1. Adubo");*/
                    System.out.println("2. Adubo Orgânico");
                    System.out.print("Selecione uma opção: ");
                    int tipoAdubo = scanner.nextInt();

                    switch (tipoAdubo) {
                        /*case 1:
                            // Manipulação para a classe Adubo
                            System.out.println("Adubo selecionado: " + adubo.tipo);
                            System.out.println("Quantidade atual: " + adubo.quantidadeKg);
                            System.out.println("Preço atual: " + adubo.preco);

                            System.out.print("Deseja atualizar a quantidade? (s/n): ");
                            char respostaQuantidadeAdubo = scanner.next().charAt(0);
                            if (respostaQuantidadeAdubo == 's' || respostaQuantidadeAdubo == 'S') {
                                System.out.print("Digite a nova quantidade: ");
                                adubo.quantidadeKg = scanner.nextInt();
                            }

                            System.out.print("Deseja atualizar o preço? (s/n): ");
                            char respostaPrecoAdubo = scanner.next().charAt(0);
                            if (respostaPrecoAdubo == 's' || respostaPrecoAdubo == 'S') {
                                System.out.print("Digite o novo preço: ");
                                adubo.preco = scanner.nextDouble();
                            }

                            System.out.println("Nova quantidade de " + adubo.tipo + ": " + adubo.quantidadeKg);
                            System.out.println("Novo preço de " + adubo.tipo + ": " + adubo.preco);

                            System.out.println("Informações adicionais sobre o adubo:");
                            adubo.aplicar();
                            adubo.armazenar();
                            break;*/

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
                            ((AduboOrganico) adubo).compostar();
                            ((AduboOrganico) adubo).reciclar();
                            break;

                        default:
                            System.out.println("Opção inválida. Voltando ao menu principal.");
                            break;
                    }
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

    public static void exibirEstoque(Planta arvore, Servico poda, Vaso vaso, Ferramenta tesoura, Adubo adubo) {
        System.out.println("Estoque Atual:");
        System.out.println("Classe: Planta | Item: " + arvore.nome + " | Quantidade: " + arvore.quantidade + " | Preço/unidade: " + arvore.preco);
        /*System.out.println("Classe: Árvore | Item: " + carvalho.nome + " | Quantidade: " + carvalho.quantidade + " | Preço/unidade: " + carvalho.preco);*/
        System.out.println("Classe: Serviço | Item: " + poda.descricao + " | Quantidade: " + poda.quantidade + " | Preço/unidade: " + poda.preco);
        System.out.println("Classe: Vaso | Item: " + vaso.material + " | Quantidade: " + vaso.quantidade + " | Preço/unidade: " + vaso.preco);
        System.out.println("Classe: Ferramenta | Item: " + tesoura.nome + " | Quantidade: " + tesoura.quantidadeEmEstoque + " | Preço/unidade: " + tesoura.preco);
        System.out.println("Classe: Adubo | Item: " + adubo.tipo + " | Quantidade: " + adubo.quantidadeKg + " | Preço/unidade: " + adubo.preco);
        System.out.println();
    }
}
