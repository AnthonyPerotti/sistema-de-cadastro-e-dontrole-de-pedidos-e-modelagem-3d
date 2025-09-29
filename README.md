# 📄 Sistema de Cadastro e Controle de Pedidos e Modelagem 3D  

Este projeto tem como objetivo o desenvolvimento de um **sistema de controle de pedidos e vendas** para uma empresa de impressão 3D.  
O sistema permite gerenciar pedidos considerando fatores como **peso, volume, tempo de impressão, tipo de material** e até mesmo a **modelagem de peças do zero**.  

---

## 🚀 Funcionalidades Principais  
- **Cadastro de Pedidos**: informações detalhadas como dimensões, material, tempo de impressão e valor.  
- **Subtipos de Pedidos**:  
  - **Pedido Externo** → inclui taxa de envio para fora de Santa Maria.  
  - **Pedido Modelagem Zero** → criação de modelos do zero, com taxa adicional.  
  - **Pedido Material Especial** → uso de materiais diferenciados com custo extra.  
- **Cadastro de Clientes**: dados completos como nome, CPF, contato e endereço.  
- **Listagem e Consulta**: pedidos armazenados em `ArrayList` e exibidos em tabelas.  
- **Gerenciamento Completo**: alteração, exclusão e atualização de clientes e pedidos com persistência em arquivos `.txt`.  

---

## 🛠️ Tecnologias Utilizadas  
- **Java com Apache Ant (NetBeans IDE)**  
- **Java Swing** → interface gráfica  
- **Tratamento de Exceções** → cadastros inválidos, CPFs duplicados e ausência de dados  
- **Arquivos `.txt`** → armazenamento dos registros  

---

## 🖥️ Interfaces do Sistema  
- **🔑 Login** → acesso restrito com autenticação.  
- **🏠 Tela Principal** → menu e atalhos para funcionalidades.  
- **📝 Cadastrar Pedidos** → preenchimento de dados, seleção de imagem/modelagem e salvamento.  
- **📊 Consultar Pedidos** → exibição, pesquisa por ID/CPF, alteração e exclusão.  

---

## 📂 Estrutura de Classes  
- **Pedidos (Superclasse)**  
  - PedidoExterno  
  - PedidoModelagemZero  
  - PedidoMaterialEspecial  
- **Cliente**  
- **ListarPedidos**  
- **PedidosTotais**  

---

✨ Este sistema oferece uma solução prática e organizada para **controle de pedidos de impressão 3D**, desde o cadastro até a consulta final, garantindo **consistência e eficiência** no processo.  
