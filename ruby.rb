require 'sinatra'

get '/' do
  'Hello, World!'
end

get '/login' do
  erb :login
end

post '/login' do
  username = params[:username]
  password = params[:password]
  # Add your login logic here
  "Username: #{username}, Password: #{password}"
end

