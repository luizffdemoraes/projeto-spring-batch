# Estudos sobre Spring Batch: 

<h1 align="center">
<a href="https://spring.io/projects/spring-batch"> Documentação oficial</a>
</h1>

# Scripts executados no Mysql
# Selecionar banco de dados
```
use spring_batch
```

# Exibir tabelas atreladas ao banco de dados
```
show tables;
```

<p align="center">
  <img alt="Comando show tables" src="imagens/show-tables.png">
</p>


# Quantas vezes o batch foi executado com sucesso?
```
select * from batch_job_instance;
```

<p align="center">
  <img alt="Comando select from batch_job_instances" src="imagens/batch_job_instance.png">
</p>

# Quantas vezes o batch foi executado no total (sucesso + falha)?
# Apresenta duração e status
```
select * from batch_job_execution;
```

<p align="center">
  <img alt="Comando select from batch_job_execution" src="imagens/batch_job_execution.png">
</p>

# Quais dados foram salvos no contexto de execução do job
```
select * from batch_job_execution_context;
```
<p align="center">
  <img alt="Comando select from batch_job_execution_context" src="imagens/batch_job_execution_context.png">
</p>

# Quais step execution foram executados
```
select * from batch_step_execution;
```
<p align="center">
  <img alt="Comando select from batch_step_execution" src="imagens/batch_step_execution.png">
</p>


# Quais informações especificas do step importantes para identificar a lógica
```
select * from batch_step_execution_context;
```
<p align="center">
  <img alt="Comando select from batch_step_execution_context" src="imagens/batch_step_execution_context.png">
</p>
