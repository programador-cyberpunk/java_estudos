        package models;

        public class Usuarios {
            private int idUsuario;
            private String email;
            private String senha;
            private String nome;
            private String cpf;
            private String endereco;
            private String bairro;
            private String cidade;
            private String uf;
            private String cep;
            private String telefone;
            private String foto;
            private String ativo;


            public Usuarios() {

            }


            public Usuarios(String email, String senha, String nome, String cpf) {
                this.setEmail(email);
                this.setSenha(senha);
                this.setNome(nome);
                this.setCpf(cpf);
            }

            public Usuarios(int idUsuario, String email, String senha, int NivelUsuario, String nome, String cpf, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String foto, String ativo) {
                this.setIdUsuario(idUsuario);
                this.setEmail(email);
                this.setSenha(senha);
                this.setNivelUsuario(NivelUsuario);
                this.setNome(nome);
                this.setCpf(cpf);
                this.setEndereco(endereco);
                this.setBairro(bairro);
                this.setCidade(cidade);
                this.setUf(uf);
                this.setCep(cep);
                this.setTelefone(telefone);
                this.setFoto(foto);
                this.setAtivo(ativo);
            }

            ////////////////////////////
            public int getIdUsuariio(int IdUsuario){
               return idUsuario;
            }
            public void setIdUsuario(int idUsuario){
                this.idUsuario = idUsuario;
            }
            ////////////////////////////////

            public String getEmail(String email){
                return email;
            }
            public  void setEmail(String email){
                if(email.contains("@")){
                    this.email = email;
                }else{
                    email = "";
                }
            }
            ////////////////////////////
            public String getSenha(String senha){
                return senha;
            }
            public void setSenha(String senha){
                this.senha = senha;
            }
            /////////////////////////////
            public int getNivelUsuario(int NivelUsuario){
                return idUsuario;
            }
            public void setNivelUsuario(int NivelUsuario){
            }
            //////////////////////////////
            public  String getNome(String Nome){
                return nome;
            }
            public void setNome(String Nome){
                this.nome = Nome;
            }
            ///////////////////////////
            public String getCpf(){
                return cpf;
            }
            public void setCpf(String cpf){
                this.cpf = cpf;
            }
            ///////////////////////////
            public String getEndereco(String endereco){
                return endereco;
            }
            public void setEndereco(String endereco){
                this.endereco = endereco;
            }
            //////////////////////////
            public String getBairro(String bairro){
                return bairro;
            }
            public void setBairro(String bairro){
                this.bairro = bairro;
            }
            ///////////////////////////
            public String getCidade(String cidade){
                return cidade;
            }
            public void setCidade(String cidade){
                this.cidade = cidade;
            }
            ////////////////////////////
            public String getUf(String uf){
                return uf;
            }
            public void setUf(String uf){
                this.uf = uf;
            }
            ////////////////////////////////
            public String getCep(String cep){
                return cep;
            }
            public void setCep(String cep){
                this.cep = cep;
            }
            /////////////////////////////////
            public  String getTelefone(String telefone){
                return telefone;
            }
            public void setTelefone(String telefone){
                this.telefone = telefone;
            }
            ///////////////////////////////
            public String getFoto(String foto){
                return foto;
            }
            public void setFoto(String foto){
                this.foto = foto;
            }
            ////////////////////////////
            public String getAtivo() {
                return ativo;
            }
            ///////////////////////////////

            public String getFoto() {
                return foto;
            }
            public void setAtivo(String ativo){
                this.ativo = ativo;
            }
        }