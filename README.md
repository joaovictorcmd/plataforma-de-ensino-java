# DESAFIO: Plataforma de ensino
### Módulo 04: Programação Moderna - Capítulo: Herança e Polimorfismo | DEVSUPERIOR

Você foi contratada(o) para criar um sistema de plataforma de ensino. Para isto você deve criar um
programa para ler os dados das aulas de um curso, e em seguida mostrar a duração total do curso, que é
a soma das durações de cada aula.

Cada aula pode ser um conteúdo em vídeo, ou então uma tarefa. Os dados de cada aula são:

Vídeo: título, url e duração em segundos
Tarefa: título, descrição e quantidade de questões

A duração (em segundos) de uma aula vídeo é a
própria duração do vídeo, e a duração de uma aula
tarefa é de cinco minutos por questão (exemplo: se a
tarefa possui 3 questões, então a duração da tarefa é
15 minutos).

Você deve representar os dados conforme modelo ao
lado. O método duration() na classe Lesson é um
método abstrato que retorna a duração da aula.

Você deve criar uma única lista do tipo
List<Lesson> para armazenar todas aulas. A
chamada do método duration() deve ser polimórfica.
  
## DIAGRAMA:
![Captura de tela 2023-05-24 173743](https://github.com/joaovictorcmd/plataforma-de-ensino-java/assets/107885917/fd0c9fb5-946b-4762-a497-b97775b0e6ab)
  
## EXEMPLO:
![EXASD](https://github.com/joaovictorcmd/plataforma-de-ensino-java/assets/107885917/43a2d7ca-0116-41b6-be18-aea2c9b744b5)
  
