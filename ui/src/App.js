import React, { Component } from 'react';
import './App.css';
import Header from './Header.jsx';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <Header name="Jeremy" />
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
      </div>
    );
  }
}

export default App;
