import React, { useState } from 'react';

function Tabs() {
  const [activeTab, setActiveTab] = useState(0);

  const handleTabClick = (index) => {
    setActiveTab(index);
  };

  return (
    <div className="tabs">
      <div className="tab-buttons">
        <button className={activeTab === 0 ? 'active' : ''} onClick={() => handleTabClick(0)}>Tab 1</button>
        <button className={activeTab === 1 ? 'active' : ''} onClick={() => handleTabClick(1)}>Tab 2</button>
        <button className={activeTab === 2 ? 'active' : ''} onClick={() => handleTabClick(2)}>Tab 3</button>
      </div>
      <div className="tab-content">
        {activeTab === 0 && (
          <div className="tab-panel">
            <h2>Tab 1 Content</h2>
            <p>Content for Tab 1 goes here.</p>
          </div>
        )}
        {activeTab === 1 && (
          <div className="tab-panel">
            <h2>Tab 2 Content</h2>
            <p>Content for Tab 2 goes here.</p>
          </div>
        )}
        {activeTab === 2 && (
          <div className="tab-panel">
            <h2>Tab 3 Content</h2>
            <p>Content for Tab 3 goes here.</p>
          </div>
        )}
      </div>
    </div>
  );
}

export default Tabs;
