import React from 'react';
import logo from './logo.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="logo-1" alt="logo" />
        <h3>Bem vindo ao time de <strong>Consultoria Número 1</strong></h3>
        <p>
          Para fazer algo bem feito, é preciso muito estudo, dedicação e prática. Isto exige especialização.
          Por exemplo, ninguém vê uma equipe de futebol de competitiva hora jogando futebol, hora vôlei, hora basquete.
          Normalmente, as empresas não podem contar com um time interno de especialistas em cada área. Este time interno
          conhecerá muito do negócio da empresa, mas quando estiver implantando uma nova solução, provavelmente esta será sua primeira experiência.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
