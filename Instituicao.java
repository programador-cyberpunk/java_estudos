        package models;

        public class Instituicao {
            String nome;
            String cpf_cnpj;
            String tipoPessoa;
            String endereco;
            String bairro;
            String cidade;
            String cep;
            String telefone;
            String email;
            String logo;

            public Instituicao() {

            }

            public Instituicao(String nome, String cpf_cnpj, String tipoPessoa, String endereco, String bairro, String cidade, String cep, String telefone, String email, String logo) {
                this.setNome(nome);
                this.setCpf_cnpj(cpf_cnpj);
                this.setTipoPessoa(tipoPessoa);
                this.setEndereco(endereco);
                this.setBairro(bairro);
                this.setCidade(cidade);
                this.setCep(cep);
                this.setTelefone(telefone);
                this.setEmail(email);
                this.setLogo(logo);
            }


                //setando os bagulho
                public String getNome (String nome){
                    return nome;
                }
                public void setNome (String nome){
                    this.nome = nome;
                }
                //////////////////////////////////
                public String getCpf_cnpj (String cpf_cnjp){
                    return cpf_cnpj;
                }
                public void setCpf_cnpj (String cpf_cnpj){
                    this.cpf_cnpj = cpf_cnpj;
                }
                ////////////////////////////////////////
                public String getTipoPessoa (String tipoPessoa){
                    return tipoPessoa;
                }

                public void setTipoPessoa (String tipoPessoa){
                    this.tipoPessoa = tipoPessoa;
                }
                ////////////////////////////
                public String getEndereco (String enderco){
                    return endereco;
                }
                public void setEndereco (String endereco){
                    this.endereco = endereco;
                }
                ////////////////////////
                public String getBairro (String bairro){
                    return bairro;
                }
                public void setBairro (String bairro){
                    this.bairro = bairro;
                }
                //////////////////////////
                public String getCidade (String cidade){
                    return bairro;
                }
                public void setCidade (String cidade){
                    this.cidade = cidade;
                }
                //////////////////////////
                public int getCep (int cep){
                    return cep;
                }
                public void setCep (String cep){
                    this.cep = cep;
                }
                //////////////////////////
                public String getTelefone (String telefone){
                    return telefone;
                }
                public void setTelefone (String telefone){
                    this.telefone = telefone;
                }
                ///////////////////////////
                public String getEmail (String email){
                    return email;
                }
                public void setEmail (String email){
                    this.email = email;
                }
                /////////////////////////
                public String getLogo (String logo){
                    return logo;
                }
                public void setLogo (String logo){
                    this.logo = logo;
                }
            }

