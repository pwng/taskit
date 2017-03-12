var React = require('react');
var ReactDOM = require('react-dom');

var EmployeeList = React.createClass({
    render: function () {
        return (
            <ul>
                <li>Christophe Coenraets</li>
                <li>Lisa Jones</li>
            </ul>
        );
    }
});

class HomePage extends React.Component {
  render() {
    return (
    	<div>
    	<h1>Hello dong zhi men</h1>
    	<EmployeeList />
    	</div>
    );
  }
}

ReactDOM.render(<HomePage/>,  document.body);