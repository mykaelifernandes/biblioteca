INSERT INTO tb_biblioteca(nome) VALUES ('Professor(a)');
INSERT INTO tb_biblioteca(nome) VALUES ('Aluno(a)');

INSERT INTO tb_usuario(biblioteca_id, usuario, nome, numero) VALUES (2, 1, 'Maria', '6557-8579');
INSERT INTO tb_usuario(biblioteca_id, usuario, nome, numero) VALUES (2, 2, 'Patricia', '9686-4537');
INSERT INTO tb_usuario(biblioteca_id, usuario, nome, numero) VALUES (1, 3, 'Gilberto', '7475-7858');
INSERT INTO tb_usuario(biblioteca_id, usuario, nome, numero) VALUES (1, 4, 'Carlos', '3546-7553');

INSERT INTO tb_livro_list (name) VALUES ('Romance');
INSERT INTO tb_livro_list (name) VALUES ('Auto-ajuda');
INSERT INTO tb_livro_list (name) VALUES ('Biografia');
INSERT INTO tb_livro_list (name) VALUES ('Literatura Cristã');

INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (1, 'A culpa é das estrelas', 2012, 'John Green', 'Romance', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/1.png', '“A culpa é das estrelas”, de John Green, é um dos melhores livros de romance, com enredo dramático sobre jovens lutando contra um câncer, enquanto nos preenchem de ensinamentos sobre a vida.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (2, 'A cabana', 2007, 'William Paul Young', 'Romance', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/2.png','Missy, a filha mais nova, foi raptada e, de acordo com as provas encontradas numa cabana abandonada, brutalmente assassinada. Quatro anos mais tarde, Mack, mergulhado numa depressão da qual nunca recuperou, recebe um bilhete, aparentemente escrito por Deus, convidando-o a voltar à malograda cabana.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (3, 'A insustentável leveza do ser', 1982, 'Milan Kundera', 'Romance', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/3.png', 'É um dos maiores clássicos da literatura contemporânea. A ação de A Insustentável Leveza do Ser desenrola-se em Praga, em 1968, centrando-se no cirurgião Tomas que procura a liberdade sexual como forma de alcançar a felicidade.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (4, 'O código da Vinci', 2003, 'Dan Brown', 'Romance Policial', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/4.png', 'O Código Da Vinci é um romance policial que tem como protagonista um simbologista norte-americano. Através da obra de Leonardo Da Vinci, onde encontra várias mensagens codificadas, tenta arranjar provas para desvendar um segredo com centenas de anos. No livro surgem instituições como a Opus Dei e o Priorado do Sião.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (5, 'Guerra e Paz', 1865, 'Liev Tolstói', 'Romance Histórico', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/5.png', 'Guerra e Paz é um romance histórico escrito pelo autor russo Liev Tolstói e publicado entre 1865 e 1869 no Russkii Vestnik, um periódico da época. É uma das obras mais volumosas da história da literatura universal. O livro narra a história da Rússia à época de Napoleão Bonaparte.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (6, 'Um corpo na biblioteca', 1942, 'Agatha Christie', 'Romance Policial', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/6.png', ' Às 7 horas da manhã, os Bantry acordam e encontram o corpo de uma jovem em sua biblioteca, sem fazer ideia de como chegou ali. Chocada com os acontecimentos, a Mrs. Bantry chama sua amiga, Miss Marple, a detetive amadora mais famosa da pequena St. Mary Mead, para descobrir a identidade da garota e do assassino.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (7, 'Como fazer amigos e inflenciar pessoas', 1936, 'Dale Carnegie', 'Auto ajuda', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/7.png', 'Como fazer amigos e influenciar pessoas é um livro da autoria do estadunidense Dale Carnegie, destinado a desenvolver estratégias comunicativas e de ajuda entre pessoas.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (8, 'Nietzche', 1960, 'Hollingdale', 'Biografia', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/8.png', 'Relato sobre a vida e as obras de Nietzsche para os estudiosos do grande filósofo. Esta biografia clássica foi publicada originalmente na década de 1960 e recebida com entusiasmo na época.');
INSERT INTO tb_livro (id, titulo, ano, autor, genero, img_url, descricao) VALUES (9, 'Mais que um carpiteniro', 1976, 'Josh McDowell', 'Literatura Cristã', 'https://raw.githubusercontent.com/mykaelifernandes/java/main/resources/9.png', 'Em 13 capítulos, o leitor passa dos argumentos científicos aos teológicos com inúmeras referências bíblicas e uma profunda argumentação baseada em amplo conhecimento exegético - do porquê das declarações de Jesus, e como elas evidenciam a sua divindade, e o sentido de seu sacrifício e ressurreição.');

INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (1, 2, 1);
INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (1, 3, 2);
INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (1, 4, 3);
INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (1, 5, 4);
INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (1, 6, 5);

INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (2, 7, 6);

INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (3, 8, 7);

INSERT INTO tb_belonging (list_id, livro_id, position) VALUES (4, 9, 8);