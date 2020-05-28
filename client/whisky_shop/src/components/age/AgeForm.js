import React from 'react';


function AgeForm(props) {
  return(
    <div className="Age">
      <div className="age-container">
        <h3>Welcome to</h3>
        <h1>THE DRAM</h1>
        <p>Are you 18 or older?</p>
        <form onSubmit={e => props.handleSubmit(e)}>
          <select value={props.userMonth} onChange={e => props.handleMonthChange(e)}>
            <option value={0}>January</option>
            <option value={1}>February</option>
            <option value={2}>March</option>
            <option value={3}>April</option>
            <option value={4}>May</option>
            <option value={5}>June</option>
            <option value={6}>July</option>
            <option value={7}>August</option>
            <option value={8}>September</option>
            <option value={9}>October</option>
            <option value={10}>November</option>
            <option value={11}>December</option>
          </select>
          <select value={props.userYear} onChange={e => props.handleYearChange(e)}>
            {props.options}
          </select><br/>
          <label>
            Remember Me
            <input
              name="rememberMe"
              type="checkbox"
              value={props.isChecked}
              onChange={props.toggleCheck} />
          </label><br/>
          <button className="pass-button" onClick={e => props.handleOfAgeCick(window.location=('/whiskies'))}>Enter</button>
        </form>
        <button className="link-button" onClick={e => props.handleNotOfAgeClick(window.open('http://www.google.com'))}>I am not of legal drinking age</button>
      </div>
    </div>
  )
}

export default AgeForm;
