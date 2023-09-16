const { expect } = require('chai');
const { calcularmedia } = require('../src/media');

describe('Calculadora de Media', () => {

  it('Calculadora deve rodar tranquilo', () => {
    const np1 = 80; 
    const np2 = 78; 

    const mediaEsperada = (79);
    const mediaCalculada = calcularMedia(np1, np2);

    expect(mediaCalculada).to.equal(mediaEsperada);
  });

});