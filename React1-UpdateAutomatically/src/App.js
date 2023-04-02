import React, { useState } from 'react';

function App() {
  const [inputValue, setInputValue] = useState('');

  const handleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  return (
    <div>
      <label htmlFor="inputField">Enter some text:</label>
      <input
        type="text"
        id="inputField"
        value={inputValue}
        onChange={handleInputChange}
      />
      <p>{inputValue}</p>
    </div>
  );
}


export default App;
