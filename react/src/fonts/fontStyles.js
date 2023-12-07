import { createGlobalStyle } from 'styled-components';
import SuperCoolWoff from './Super-Cool-Personal-Use.woff'

const FontStyle = createGlobalStyle`
@font-face {
    font-family: 'Super Cool';
    src: url(${SuperCoolWoff}) format('woff');
}
`;
export default FontStyle;